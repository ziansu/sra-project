void setDrawerSelection(int identifier) {
    try {
        com.mikepenz.materialdrawer.Drawer.Result drawerResult = ((net.jejer.hipda.ui.MainFrameActivity) (getActivity())).drawerResult;
        if ((!(drawerResult.isDrawerOpen())) && ((drawerResult.getPositionFromIdentifier(identifier)) != (drawerResult.getCurrentSelection())))
            drawerResult.setSelectionByIdentifier(identifier, false);
        
    } catch (java.lang.Exception ignored) {
    }
}