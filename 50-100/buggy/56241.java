@java.lang.Override
public void onControlsEvent(com.kaltura.babble.player.ControlsEvent controlsEvent) {
    com.kaltura.babble.player.ControlsEvent.ButtonClickEvent buttonClickEvent = controlsEvent.getButtonClickEvent();
    switch (buttonClickEvent) {
        case SELECT_TRACKS_DIALOG :
            mPlayerControlsView.toggleControlsVisibility(false);
            break;
        case BACK_BUTTON :
            break;
        case FULL_SCREEN_SIZE :
            break;
        case PLAY_PAUSE :
            togglePlayPauseReplay();
            break;
        case DRAGG_STARTED :
        case DRAGGING :
        case DRAGG_ENDED :
            handleScrubBarDragging(buttonClickEvent, controlsEvent.getPosition());
            break;
    }
}