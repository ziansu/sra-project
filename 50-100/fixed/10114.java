private void clearData() {
    selectedFaculties.clear();
    chosenFaculties = "";
    questions.clear();
    newDate = "";
    for (int i = 0; i < (checked.length); i++) {
        checked[i] = false;
    }
    aSpinner1.setSelection(0);
}