void keepState(int state) {
    switch (state) {
        case android.service.quicksettings.Tile.STATE_ACTIVE :
            changeToActive();
            break;
        case android.service.quicksettings.Tile.STATE_INACTIVE :
            changeToInactive();
            break;
        default :
            break;
    }
}