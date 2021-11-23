@java.lang.Override
public void touchDown(int screenX, int screenY, int pointer, int button) {
    java.lang.System.out.println(getCamera().unproject(new com.badlogic.gdx.math.Vector3(screenX, screenY, 0)));
}