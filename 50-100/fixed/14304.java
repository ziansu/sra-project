private void showFirstTaskOnly(seedu.whatsnext.model.Model model) {
    seedu.whatsnext.model.task.BasicTaskFeatures task = model.getTaskManager().getTaskList().get(0);
    final java.lang.String[] splitName = new java.lang.String[]{ task.getName().toString() };
    model.updateFilteredTaskList(new java.util.HashSet<>(java.util.Arrays.asList(splitName)));
    java.lang.System.out.println(model.getFilteredTaskList().size());
    assert (model.getFilteredTaskList().size()) == 1;
}