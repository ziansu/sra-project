@java.lang.Override
public boolean keyDown(int keycode) {
    collony.util.GIP.preccedKeys.put(keycode, true);
    return true;
}