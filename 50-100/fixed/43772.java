private void listenForEdit(javafx.scene.input.KeyEvent event) {
    int editIndexPosition = 0;
    java.lang.String inputString = userInput.getText();
    main.resources.view.RootLayoutController.EditType type = null;
    if (isEditIndividualFormat(inputString)) {
        editIndexPosition = 1;
        type = main.resources.view.RootLayoutController.EditType.INDIVIDUAL;
    }else
        if (isEditAllFormat(inputString)) {
            editIndexPosition = 2;
            type = main.resources.view.RootLayoutController.EditType.ALL;
        }
    
    if (editIndexPosition > 0) {
        int index = getEditIndex(inputString, editIndexPosition);
        autoCompleteEdit(index, type);
    }
}