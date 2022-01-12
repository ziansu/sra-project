@java.lang.Override
public boolean matches(edu.umd.cs.findbugs.classfile.ClassDescriptor argument) {
    return argument.getSimpleName().equals(simpleClassName);
}