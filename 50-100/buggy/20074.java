public void onClickClear(android.view.View v) {
    input1 = 0.0;
    input2 = 0.0;
    flag = false;
    for (int i = 0; i < (operation.length); i++) {
        operation[i] = 0;
    }
    result.setText("");
}