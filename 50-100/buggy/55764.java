private void injectDelegateLifeCycleIntoConductorController(javassist.CtClass ctClass, weaver.instrumentation.injection.ClassInjector classInjector) throws java.lang.Exception {
    javassist.CtMethod onCreateView = findBestMethod(ctClass, "onCreateView", easymvp.weaver.ViewDelegateBinder.LAYOUT_INFLATER_CLASS, easymvp.weaver.ViewDelegateBinder.VIEW_GROUP_CLASS);
    javassist.CtMethod onAttach = findBestMethod(ctClass, "onAttach", easymvp.weaver.ViewDelegateBinder.VIEW_CLASS);
    javassist.CtMethod onDetach = findBestMethod(ctClass, "onDetach", easymvp.weaver.ViewDelegateBinder.VIEW_CLASS);
    boolean applied = dagger2Extension.apply(ctClass);
    atTheBeginning(classInjector, onCreateView, (applied ? easymvp.weaver.ViewDelegateBinder.STATEMENT_CALL_INITIALIZE_WITH_FACTORY : easymvp.weaver.ViewDelegateBinder.STATEMENT_CALL_INITIALIZE));
    AfterSuper(classInjector, onAttach, easymvp.weaver.ViewDelegateBinder.STATEMENT_CALL_ATTACH);
    beforeSuper(classInjector, onDetach, easymvp.weaver.ViewDelegateBinder.STATEMENT_CALL_DETACH);
}