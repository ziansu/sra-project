public void moveFocus(tabshifter.Directions.Direction direction) {
    tabshifter.valueobjects.LayoutElement layout = tabshifter.TabShifter.calculateAndSetPositions(ide.snapshotWindowLayout());
    if (layout == (tabshifter.valueobjects.LayoutElement.none))
        return ;
    
    tabshifter.valueobjects.Window window = tabshifter.TabShifter.currentWindowIn(layout);
    if (window == null)
        return ;
    
    tabshifter.valueobjects.Window targetWindow = direction.findTargetWindow(window, layout);
    if (targetWindow == null)
        return ;
    
    ide.setFocusOn(targetWindow);
}