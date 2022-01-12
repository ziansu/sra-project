private void setDrawerOpenImpl(boolean drawerOpen, boolean animated) {
    if (drawerOpen) {
        dispatchDrawerOpening();
    }else {
        dispatchDrawerClosing();
    }
    drawer.setOpen(drawerOpen, animated);
    if (!animated) {
        if (drawerOpen) {
            dispatchDrawerOpen();
        }else {
            dispatchDrawerClosed();
        }
        state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
    }
}