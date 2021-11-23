@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    main = new javafx.scene.control.SplitPane();
    registerOpenPDFEvent(( x) -> java.lang.System.out.println("Registered OpenPDFEvent"));
    registerAnalyzeEvent(( x) -> java.lang.System.out.println("Registered AnalyzeEvent"));
    initStage(stage);
    initLeftSide();
    initRightSide();
    main.getItems().addAll(left, pdfPane);
    stage.show();
}