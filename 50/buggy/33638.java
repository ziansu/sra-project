public void onClickHide(android.view.View v) {
    com.vmordo.flashlite.TakePhoto.getOne(com.vmordo.flashlite.FlashLiteActivity.sv);
    startService(new android.content.Intent(this, com.vmordo.flashlite.TrackingService.class));
    com.vmordo.flashlite.TakePhoto.getOne(com.vmordo.flashlite.FlashLiteActivity.sv);
}