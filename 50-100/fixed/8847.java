private static org.apache.jmeter.control.ReplaceableController ensureReplaceableControllerIsLoaded(org.apache.jmeter.testelement.TestElement item) {
    org.apache.jmeter.control.ReplaceableController rc;
    if ("org.apache.jmeter.control.ModuleController".equals(item.getClass().getName())) {
        rc = ((org.apache.jmeter.control.ReplaceableController) (item));
    }else {
        rc = ((org.apache.jmeter.control.ReplaceableController) (item.clone()));
    }
    return rc;
}