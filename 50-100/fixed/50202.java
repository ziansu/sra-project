private void switchToLoadedList(android.view.MenuItem item) {
    if (!(item.getTitle().equals(mWorkingList.getName()))) {
        mFileController.saveList(mWorkingList);
        java.lang.String itemName = item.getTitle().toString();
        java.util.ArrayList<java.lang.String> taskList = new java.util.ArrayList(mFileController.loadFile(itemName));
        mWorkingList = fileToList(taskList, itemName);
        mTitleText.setText(mWorkingList.getName());
        displayTable(mWorkingList);
    }
}