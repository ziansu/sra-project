public void loadExercise(controller.Exercise e) {
    try {
        tabPane.setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.SELECTED_TAB);
        java.lang.System.out.println(e.getName());
        tabPane.getTabs().clear();
        tabPane.getTabs().addAll(controller.ExerciseHandling.createTabView(e));
        description.setText(("Description: \n" + (e.getDescription())));
    } catch (java.lang.NullPointerException npe) {
        java.lang.System.out.print("Please load a catalog first.");
    }
}