private void showBlockList() {
    textArea.setText("\u5df2\u5c4f\u853d\u7684\u5217\u8868: \n");
    java.util.ArrayList<java.lang.String> list = getBlockList();
    for (java.lang.String line : list) {
        textArea.append((line + "\n"));
    }
}