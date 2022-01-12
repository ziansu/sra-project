@java.lang.Override
public void onChangeGUI(java.lang.String tokens) {
    if (acceptChanges) {
        if (((changeIndex) >= 0) && ((changeIndex) != ((changesList.size()) - 1))) {
            changesList.subList(changeIndex, ((changesList.size()) - 1));
        }
        changesList.add(tokens);
        changeIndex = (changesList.size()) - 1;
    }
}