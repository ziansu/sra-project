@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    View.Main_GUI.window = primaryStage;
    View.Main_GUI.window.setTitle("Adventure Alley");
    Controller.SceneHandler.getInstance().createScene(0);
    Controller.SceneHandler.getInstance().applyScene(0);
    Controller.ActivityController activityController = new Controller.ActivityController(((View.ActivityView) (Model.SceneCollection.getInstance().getSceneList().get(0))));
    View.Main_GUI.window.show();
}