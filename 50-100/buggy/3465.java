private void updateNotification(int newState) {
    switch (newState) {
        case m.nischal.melody.MediaPlayerService.STATE_PLAYING :
            setUpRemoteViews();
            remoteViews.setImageViewResource(R.id.action_play_pause, R.drawable.ic_pause_white_36dp);
            notification.bigContentView = remoteViews;
            notifyChange();
            break;
        case m.nischal.melody.MediaPlayerService.STATE_COMPLETED :
        case m.nischal.melody.MediaPlayerService.STATE_PAUSED :
            remoteViews.setImageViewResource(R.id.action_play_pause, R.drawable.ic_play_arrow_white_36dp);
            notifyAutoDelete();
            break;
    }
}