@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean shouldShowShare = (mMoveModel.getHistoryCoordiates().size()) > (com.stdnull.runmap.common.RMConfiguration.MIN_CACHE_DATA);
    mMoveModel.saveModelToDatabase(true);
    if (shouldShowShare) {
        isForceExit = true;
        mapObject.addLocationFilter(new com.stdnull.runmap.modules.map.filter.LocationEndFilter(true));
        mMovementTrackActivity.showExitHintLayout();
    }else {
        mMovementTrackActivity.finishActivity();
    }
}