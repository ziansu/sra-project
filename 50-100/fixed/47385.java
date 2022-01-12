@java.lang.Override
public void onLoad(javassist.ClassPool pool, java.lang.String ctClass) throws javassist.CannotCompileException, javassist.NotFoundException {
    javassist.CtClass cc = pool.get(ctClass);
    cc.setModifiers(java.lang.reflect.Modifier.PUBLIC);
    boolean javassist = ctClass.contains("javassist");
    boolean profiler = ctClass.contains("ist.meic.pa");
    if ((!javassist) && (!profiler)) {
        try {
            instrumentClass(cc);
        } catch (javassist.CannotCompileException e) {
            throw new javassist.CannotCompileException(e);
        }
    }
}