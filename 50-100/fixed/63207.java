private java.awt.Canvas initUi() {
    contentPane.add(middlePanel, java.awt.BorderLayout.CENTER);
    java.awt.Canvas canvas = initCanvas(middlePanel, worldSizeInPixels);
    setBoundsFromConfig();
    setTitle(rabbitescape.engine.i18n.Translation.t("Rabbit Escape"));
    pack();
    setVisible(true);
    canvas.createBufferStrategy(2);
    return canvas;
}