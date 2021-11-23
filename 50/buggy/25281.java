public void edit(seedu.emeraldo.model.task.Task toEditObj, int index, java.lang.String toEditField) throws seedu.emeraldo.commons.exceptions.IllegalValueException {
    assert toEditField != null;
    toEditObj.setDescription(new seedu.emeraldo.model.task.Description(toEditField));
    internalList.set(index, toEditObj);
}