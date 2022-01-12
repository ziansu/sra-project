public void openeditPanel(java.lang.String setName) {
    if ((_editPanelStage) != null) {
        _editPanelStage.show();
        _editPanelStage.toFront();
    }else {
        _editPanelStage = new javafx.stage.Stage();
        javafx.scene.Scene editPanelScene = _main.loadScene("QuestionSetEditPanel.fxml");
        application.QuestionSetEditPanelController editPanelController = ((application.QuestionSetEditPanelController) (editPanelScene.getUserData()));
        editPanelController.initData(_editPanelStage, setName);
        java.lang.System.out.println("Step 1 done.");
        _main.showScene(_editPanelStage, editPanelScene);
    }
}