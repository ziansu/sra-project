protected final som.vmobjects.SObject asSBoolean(final boolean result, final som.vm.Universe universe) {
    if (result) {
        return universe.trueObject;
    }else {
        return universe.falseObject;
    }
}