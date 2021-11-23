@java.lang.Override
public void start(javafx.stage.Stage stage) {
    ch.imedias.rsccfx.model.Rscc model = new ch.imedias.rsccfx.model.Rscc();
    ch.imedias.rsccfx.view.RsccEnterTokenView view = new ch.imedias.rsccfx.view.RsccEnterTokenView(model);
    javafx.scene.Scene scene = new javafx.scene.Scene(view);
    ch.imedias.rsccfx.view.RsccEnterTokenPresenter presenter = new ch.imedias.rsccfx.view.RsccEnterTokenPresenter(model, view);
    stage.setWidth(500);
    stage.setHeight(450);
    stage.setMinWidth(250);
    stage.setMinHeight(300);
    stage.setScene(scene);
    stage.setTitle(ch.imedias.rsccfx.RsccApp.APP_NAME);
    stage.show();
}