@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    newWorkoutExercisePane.setVisible(true);
    javafx.collections.ObservableList<java.lang.Integer> oneToTen = javafx.collections.FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    formList.setItems(oneToTen);
    performanceList.setItems(oneToTen);
    allExercisesList.setItems(util.Helper.getAllExercises());
}