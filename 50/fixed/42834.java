public void cleanup(org.zkoss.zk.ui.Execution exec, org.zkoss.zk.ui.Execution parent, java.util.List errs) throws java.lang.Exception {
    if ((errs != null) && ((errs.size()) > 0)) {
        org.zkoss.zats.mimic.exception.ZKExceptionHandler.getInstance().setExceptions(errs);
    }
}