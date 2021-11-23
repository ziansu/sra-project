public void moveFocus(tabshifter.Directions.Direction direction) {
    tabshifter.valueobjects.LayoutElement layout = tabshifter.TabShifter.calculateAndSetPositions(ide.snapshotWindowLayout());
    if (layout == (tabshifter.valueobjects.LayoutElement.none))
        return ;
    
    tabshifter.valueobjects.Window window = tabshifter.TabShifter.currentWindowIn(layout);
    tabshifter.valueobjects.Window targetWindow = direction.findTargetWindow(window, layout);
    ide.setFocusOn(targetWindow);
}