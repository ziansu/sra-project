@java.lang.Override
public void hide() {
    mainTheme.stop();
    mainTheme.dispose();
    entryTheme.stop();
    entryTheme.dispose();
}