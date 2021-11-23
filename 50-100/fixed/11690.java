public static void printFloatingBackground(int i, java.lang.String msg) {
    i = i + 1;
    java.lang.System.out.println((((((((UI.ui.BACKGROUND_BLUE) + (UI.ui.HIGH_INTENSITY)) + (UI.ui.YELLOW)) + i) + ".\t") + msg) + (ansi().reset())));
}