@java.lang.Override
public void clickedOnControl(java.lang.Object arg) {
    if ((_selectedButton) == arg)
        return ;
    
    StationPlacingToolSelected.fireEvent();
    selectButton(_view.getBuildStationButton());
}