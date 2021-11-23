public void onKeyback() {
    main_activity.yy_playing_msg_dlg = null;
    main_activity.yy_auto_save_listener = null;
    stopPlayMsg(false, false);
    main_activity.yy_data_source.setIsUseDefaultMessage(true);
    YYListAdapter.updateListViewTask task = new YYListAdapter.updateListViewTask();
    task.execute();
}