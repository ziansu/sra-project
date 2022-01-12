@java.lang.Override
public void start(javafx.stage.Stage stage) {
    java.lang.String imagePath = "/Users/Akhil/Desktop/CS_PICS";
    support.convexhull.PaneOrganizer paneOrganizer = new support.convexhull.PaneOrganizer(new convexhull.MyHullFinder(imagePath));
    javafx.scene.Scene scene = new javafx.scene.Scene(paneOrganizer.getRoot());
    stage.setScene(scene);
    stage.setTitle("convexhull");
    stage.show();
}