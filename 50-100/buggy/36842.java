@java.lang.Override
public void selectItem(boolean selected) {
    org.geogebra.web.web.gui.layout.panels.AlgebraDockPanelW dp = getAlgebraDockPanel();
    if ((first) && (!(dp.hasLongStyleBar()))) {
        dp.showStyleBarPanel((!selected));
    }
    super.selectItem(true);
}