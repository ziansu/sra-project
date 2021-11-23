public static int getKeyCode(javafx.scene.input.KeyCode keyCode) {
    try {
        return org.eclipse.jubula.rc.javafx.tester.util.KeyCodeUtil.getKeyCodeViaReflection("impl_getCode", keyCode);
    } catch (java.lang.Exception e) {
    }
    try {
        return org.eclipse.jubula.rc.javafx.tester.util.KeyCodeUtil.getKeyCodeViaReflection("getCode", keyCode);
    } catch (java.lang.Exception e) {
    }
    throw new java.lang.NoSuchMethodError("neither KeyCode.getCode() nor KeyCode.impl_getCode() found");
}