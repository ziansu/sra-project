private void renderConsoleOutput(java.lang.String text, java.lang.String clazz) {
    initializeOutput(RmdChunkOutputUnit.TYPE_TEXT);
    vconsole_.submit(text, clazz);
    onHeightChanged();
}