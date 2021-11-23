@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    stopService(new android.content.Intent(this, brotic.findmyfriends.Service.PositionService.class));
}