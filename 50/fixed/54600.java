public void add(seedu.address.model.person.Task toAdd) throws seedu.address.model.person.TaskList.DuplicateTaskException {
    assert toAdd != null;
    internalList.add(toAdd);
}