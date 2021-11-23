@java.lang.Override
public void initialize() {
    window.setLayout(new java.awt.GridBagLayout());
    window.setSize(new java.awt.Dimension(de.vogel612.helper.ui.impl.OverviewViewImpl.DEFAULT_WIDTH, de.vogel612.helper.ui.impl.OverviewViewImpl.DEFAULT_HEIGHT));
    window.setMinimumSize(new java.awt.Dimension(800, 500));
    window.setBackground(new java.awt.Color(0.2F, 0.3F, 0.7F, 1.0F));
    addMenuBar();
    addTranslationContainer();
    window.pack();
    window.doLayout();
}