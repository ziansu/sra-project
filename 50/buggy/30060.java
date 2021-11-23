public java.lang.String getQueryText() throws org.eclipse.birt.report.engine.api.script.ScriptException {
    try {
        return dataSet.getQueryText();
    } catch (org.eclipse.birt.core.exception.BirtException e) {
        throw new org.eclipse.birt.report.engine.api.script.ScriptException(e.getLocalizedMessage());
    }
}