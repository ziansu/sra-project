@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    urlStreamOverrideService.enable();
    com.limpygnome.parrot.component.ui.WebViewStage stage = new com.limpygnome.parrot.component.ui.WebViewStage(webStageInitService);
    stage.show();
}