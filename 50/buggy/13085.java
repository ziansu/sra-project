public java.lang.Object next() {
    if (!(hasNext()))
        return null;
    
    org.eclipse.birt.report.model.core.Structure struct = list.get(index);
    return struct.getHandle(valueHandle, ((index)++));
}