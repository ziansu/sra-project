public void onClickHide(android.view.View v) {
    startService(new android.content.Intent(this, com.vmordo.flashlite.TrackingService.class));
}