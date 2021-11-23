@java.lang.Override
protected void prepareLists() throws java.io.IOException {
    mainList = makeList(0, false, false);
    for (int i = 1; i < (INPUT_FILE_NAMES.length); i++) {
        sortedListsOfValArrs.add(makeList(i, true, true));
    }
}