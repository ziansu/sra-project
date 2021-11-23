@java.lang.Override
public void update(float delta) {
    if ((com.scgame.adozeneggs.core.SceneNavigator.getInstance().getActiveScene()) != null) {
        com.scgame.adozeneggs.core.SceneNavigator.getInstance().getActiveScene().update(delta);
    }
}