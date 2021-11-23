protected final som.vmobjects.SObject asSBoolean(boolean result, final som.vm.Universe universe) {
    if (result) {
        return universe.trueObject;
    }else {
        return universe.falseObject;
    }
}