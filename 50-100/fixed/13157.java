private void bindModelProperties(com.thogor.kinedoc.app.exercise.view.ExerciseView item) {
    exerciseListCellModel.bindRepetitions(item.defaultNrOfRepetitionsProperty());
    exerciseListCellModel.bindSets(item.defaultNrOfSetsProperty());
    exerciseListCellModel.registerRemoveAction(getListView(), item);
    exerciseListCellModel.setName(item.getName());
}