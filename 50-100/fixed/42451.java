private void setKeyState(java.lang.String keyname, java.lang.Boolean pressed) {
    if (pressed) {
        java.lang.System.out.println(("pressing " + keyname));
    }
    int keyIndex = KEYNAMEMAP.get(keyname);
    int value = (pressed) ? 1 : 0;
    integerBuffer[keyIndex] = value;
}