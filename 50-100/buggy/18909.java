private void testVideoPracticalExerciseViewer(javafx.stage.Stage primaryStage) {
    javafx.scene.Node node = com.westlyf.controller.Controllers.getNode(ControllerType.VIDEO_PRACTICAL_EXERCISE_VIEWER, com.westlyf.database.ExerciseDatabase.getVideoPracticalExerciseUsingTitle("New Sample Test Video"));
    javafx.scene.Node node = null;
    javafx.scene.Scene scene = new javafx.scene.Scene(((javafx.scene.Parent) (node)));
    primaryStage.setScene(scene);
    primaryStage.show();
}