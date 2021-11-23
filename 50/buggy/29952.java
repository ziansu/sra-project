@org.junit.After
public final void afterIntegration() {
    if ((launcher) != null) {
        launcher.dispose();
    }
    final com.badlogic.gdx.Application app = com.badlogic.gdx.Gdx.app;
    if (app != null) {
        app.exit();
    }
}