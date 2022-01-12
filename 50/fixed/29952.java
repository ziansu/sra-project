@org.junit.After
public final void afterIntegration() {
    launcher.dispose();
    final com.badlogic.gdx.Application app = com.badlogic.gdx.Gdx.app;
    if (app != null) {
        app.exit();
    }
}