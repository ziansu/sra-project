@java.lang.Override
public boolean isKeyPressed(int keycode) {
    return (kstate.getOrDefault(keycode, com.ymcmp.jine.environments.opengl.Keyboard.InputState.NONE)) == (com.ymcmp.jine.environments.opengl.Keyboard.InputState.PRESSED);
}