@java.lang.Override
public void perspectivePreDeactivate(org.eclipse.ui.IWorkbenchPage page, org.eclipse.ui.IPerspectiveDescriptor perspective) {
    org.eclipse.ui.internal.cheatsheets.views.CheatSheetView cheetSheet = org.talend.commons.ui.utils.CheatSheetUtils.getInstance().findCheetSheet("org.talend.datacleansing.core.ui.dqcheatsheet", false);
    if (null != cheetSheet) {
        cheetSheetID = cheetSheet.getCheatSheetID();
        org.talend.commons.ui.utils.CheatSheetUtils.getInstance().hideCheetSheet(cheetSheet);
    }
    cheetSheetInPerspective.put(perspective.getId(), (null != cheetSheet));
    super.perspectivePreDeactivate(page, perspective);
}