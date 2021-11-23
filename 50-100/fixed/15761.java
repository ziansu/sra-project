@java.lang.Override
public void visitClassContext(edu.umd.cs.findbugs.ba.ClassContext classContext) {
    org.apache.bcel.classfile.JavaClass javaClass = classContext.getJavaClass();
    org.apache.bcel.classfile.Method[] methodList = javaClass.getMethods();
    for (org.apache.bcel.classfile.Method m : methodList) {
        try {
            analyzeMethod(m, classContext);
        } catch (edu.umd.cs.findbugs.ba.CFGBuilderException e) {
        }
    }
}