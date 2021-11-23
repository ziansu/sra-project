@java.lang.Override
public void onChangeGUI(java.lang.String tokens) {
    if (acceptChanges) {
        if (((changeIndex) >= 0) && ((changeIndex) != ((changesList.size()) - 1))) {
            changesList = new java.util.ArrayList<>(changesList.subList(0, changeIndex));
        }
        changesList.add(tokens);
        changeIndex = (changesList.size()) - 1;
    }
}