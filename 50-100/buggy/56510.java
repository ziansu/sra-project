@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    primaryStage.setTitle("Game Theory Simulation");
    Control.Controller control = new Control.Controller();
    View.RootPane view = new View.RootPane(control);
    Model.PopulationModel model = new Model.PopulationModel(control);
    control.setView(view);
    control.setModel(model);
    primaryStage.setScene(new javafx.scene.Scene(view, 1000, 600));
    primaryStage.show();
    view.fillDefaults();
}