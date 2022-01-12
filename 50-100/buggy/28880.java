private boolean checkLinearMatrixForDeleteColumn(int column) {
    boolean isDeleteable = true;
    for (int i = 0; i < (widthVMatrix); i++) {
        if (!(linearDependenceTextFields.get(column).get(i).getText().equals("0"))) {
            isDeleteable = false;
        }
    }
    return isDeleteable;
}