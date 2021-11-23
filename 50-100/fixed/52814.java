public static java.lang.String formatStringToHtml(final io.toast.tk.dao.domain.impl.test.block.line.TestLine line) {
    if ((line.getTestResult()) != null) {
        java.lang.String message = line.getTestResult().getMessage();
        message = (message != null) ? io.toast.tk.runtime.report.TemplateHelper.returnResult(message) : "";
        return io.toast.tk.runtime.report.TemplateHelper.prettyXmlText(message);
    }
    return "&nbsp;";
}