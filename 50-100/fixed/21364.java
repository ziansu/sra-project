void setDrawerSelection(int identifier) {
    try {
        if ((getActivity()) != null) {
            com.mikepenz.materialdrawer.Drawer.Result drawerResult = ((net.jejer.hipda.ui.MainFrameActivity) (getActivity())).drawerResult;
            if (((drawerResult != null) && (!(drawerResult.isDrawerOpen()))) && ((drawerResult.getPositionFromIdentifier(identifier)) != (drawerResult.getCurrentSelection())))
                drawerResult.setSelectionByIdentifier(identifier, false);
            
        }
    } catch (java.lang.Exception ignored) {
    }
}