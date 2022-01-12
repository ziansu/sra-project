private boolean checkLinearMatrixForDeleteColumn(int column) {
    boolean isDeleteable = true;
    for (int i = 0; i < (widthVMatrix); i++) {
        if (!(linearDependenceTextFields.get(i).get(column).getText().equals("0"))) {
            isDeleteable = false;
        }
    }
    return isDeleteable;
}