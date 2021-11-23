private void removeEmptySets() {
    if (((valuesToReplace) != null) && (valuesToReplace.isEmpty())) {
        valuesToReplace = null;
    }
    if (((valuesToAdd) != null) && (valuesToAdd.isEmpty())) {
        valuesToAdd = null;
    }
    if (((valuesToDelete) != null) && (valuesToDelete.isEmpty())) {
        valuesToDelete = null;
    }
}