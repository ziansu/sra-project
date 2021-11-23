public void onCancel() {
    main_activity.yy_playing_msg_dlg = null;
    main_activity.changeShengDao(true);
    deleteMessage();
}