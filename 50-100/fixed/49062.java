private void removeEmptySets() {
    if (((valuesToAdd) != null) && (valuesToAdd.isEmpty())) {
        valuesToAdd = null;
    }
    if (((valuesToDelete) != null) && (valuesToDelete.isEmpty())) {
        valuesToDelete = null;
    }
}