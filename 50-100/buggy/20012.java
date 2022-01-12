public boolean checkAllValues() {
    md.leonis.tivi.admin.view.video.CheckUtils checker = new md.leonis.tivi.admin.view.video.CheckUtils();
    checker.checkCpuExist(VideoUtils.video.getCpu());
    if (!(checker.isOk()))
        md.leonis.tivi.admin.view.video.JavaFxUtils.showAlert("Ошибка", "Следующие данные следует поправить:", checker.getErrors(), javafx.scene.control.Alert.AlertType.ERROR);
    
    return checker.isOk();
}