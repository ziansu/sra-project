private void switchKnowhowPageEditor(int level) {
    try {
        if ((tubame.knowhow.plugin.model.view.PortabilityKnowhowListViewData.LEVEL_SECOND) == level) {
            clearKnowhowDetail();
            createDocBookPage(false);
        }else {
            clearKnowhowDetail();
            createDocBookPage(true);
        }
    } catch (org.eclipse.ui.PartInitException e) {
        tubame.knowhow.biz.exception.JbmException.outputExceptionLog(tubame.knowhow.plugin.ui.editor.multi.MaintenanceKnowhowMultiPageEditor.LOGGER, e, tubame.knowhow.biz.util.resource.MessagePropertiesUtil.getMessage(MessagePropertiesUtil.FAIL_CREATE_KNOWHOW_EDITOR));
    } catch (java.io.IOException e) {
        tubame.knowhow.biz.exception.JbmException.outputExceptionLog(tubame.knowhow.plugin.ui.editor.multi.MaintenanceKnowhowMultiPageEditor.LOGGER, e, tubame.knowhow.biz.util.resource.MessagePropertiesUtil.getMessage(MessagePropertiesUtil.FAIL_CREATE_KNOWHOW_EDITOR));
    }
}