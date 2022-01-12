@java.lang.Override
public java.lang.String getClassName(org.apache.commons.bcel6.generic.ConstantPoolGen cpg) {
    org.apache.commons.bcel6.classfile.ConstantPool cp = cpg.getConstantPool();
    org.apache.commons.bcel6.classfile.ConstantCP cmr = ((org.apache.commons.bcel6.classfile.ConstantCP) (cp.getConstant(super.getIndex())));
    java.lang.String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
    if (className.startsWith("[")) {
        throw new java.lang.IllegalArgumentException("Cannot be used on an array type");
    }
    return className.replace('/', '.');
}