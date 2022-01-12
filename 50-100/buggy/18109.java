@java.lang.Override
public void transform(javassist.CtClass ctClass) throws java.lang.Exception {
    logger.quiet(((("Start transforming " + (ctClass.getSimpleName())) + " with ") + (getClass().getSimpleName())));
    instrumentation.startWeaving(ctClass).insertInterface().implement(java.lang.Runnable.class.getCanonicalName()).inject().insertMethod("run").ifExistsButNotOverride().override(("{" + ("System.out.println(\"run\");" + "}"))).inject().inject();
}