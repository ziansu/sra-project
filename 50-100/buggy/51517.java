@java.lang.Override
protected void prepareLists() throws java.io.IOException {
    mainList = makeList(INPUT_FILE_NAMES[0], MERGE_WORD_I[0], false, false);
    for (int i = 1; i < (INPUT_FILE_NAMES.length); i++) {
        sortedListsOfValArrs.add(makeList(INPUT_FILE_NAMES[i], MERGE_WORD_I[i], true, true));
    }
}