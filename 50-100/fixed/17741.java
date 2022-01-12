public boolean toBackground(com.sun.jna.Pointer hWnd, boolean toBack) {
    com.sun.jna.Pointer HWND_BOTTOM = null;
    if (toBack) {
        HWND_BOTTOM = new com.sun.jna.Pointer(1);
    }else {
        HWND_BOTTOM = new com.sun.jna.Pointer((-1));
    }
    return user32.SetWindowPos(hWnd, HWND_BOTTOM, 0, 0, 1280, 1020, 0);
}