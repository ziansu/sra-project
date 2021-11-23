public static void clearEventLoop() {
    while (org.talend.commons.ui.gmf.util.DisplayUtils.getDisplay().readAndDispatch()) {
    } 
}