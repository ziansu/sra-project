public void handleEvent(org.eclipse.swt.widgets.Event event) {
    if ((selectedStage) != null) {
        de.darwinspl.feature.stage.editor.dialogs.StageRenameDialog stageRenameDialog = new de.darwinspl.feature.stage.editor.dialogs.StageRenameDialog(getShell(), stageModelWrapped, currentSelectedDate, selectedStage);
        stageRenameDialog.open();
        updateStageList();
    }
}