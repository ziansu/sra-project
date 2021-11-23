@java.lang.Override
public void nativeKeyPressed(org.jnativehook.keyboard.NativeKeyEvent arg0) {
    Easy.process(arg0.getKeyCode());
    java.lang.System.out.print("pressed");
}