private static void validarSalvar(boolean dao, java.lang.Object entity) {
    if (dao) {
        StartWizard.np.showFromTopProperty().set(false);
        StartWizard.np.setGraphic(new javafx.scene.image.ImageView(com.group.sisgefx.view.LoadResource.OK_SAVE));
        StartWizard.np.setText(((entity.toString()) + " Salvo(a) com sucesso!"));
        StartWizard.np.show();
        com.group.sisgefx.view.fxml.wizard.InstituicaoController.hide(3);
    }
}