private void bindModelProperties() {
    com.thogor.kinedoc.app.exercise.view.ExerciseView item = getItem();
    exerciseListCellModel.bindRepetitions(item.defaultNrOfRepetitionsProperty());
    exerciseListCellModel.bindSets(item.defaultNrOfSetsProperty());
    exerciseListCellModel.registerRemoveAction(getListView(), item);
    exerciseListCellModel.setName(item.getName());
}