public static boolean isButtonReleased(int keycode) {
    boolean res = utillities.Mouse.releasedButtons[keycode];
    utillities.Mouse.releasedButtons[keycode] = false;
    return res;
}