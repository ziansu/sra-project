public com.innowhere.relproxy.impl.jproxy.core.clsmgr.ClassDescriptor getClassDescriptor(java.lang.String className) {
    java.lang.String parentClassName;
    int pos = className.lastIndexOf('$');
    boolean inner;
    if (pos != (-1)) {
        parentClassName = className.substring(0, pos);
        inner = true;
    }else {
        parentClassName = className;
        inner = false;
    }
    com.innowhere.relproxy.impl.jproxy.core.clsmgr.ClassDescriptorSourceUnit sourceDesc = sourceUnitMapByClassName.get(parentClassName);
    if (!inner)
        return sourceDesc;
    
    return sourceDesc.getInnerClassDescriptor(className, true);
}