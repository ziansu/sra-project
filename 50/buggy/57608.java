@java.lang.Override
public void nativeKeyPressed(org.jnativehook.keyboard.NativeKeyEvent arg0) {
    boolean isQPressed = (arg0.getKeyCode()) == (org.jnativehook.keyboard.NativeKeyEvent.VC_Q);
    Easy.process(arg0.getKeyCode());
    java.lang.System.out.print("pressed");
}