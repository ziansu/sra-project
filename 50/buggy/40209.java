public void onImageButtonBack_Clicked(android.view.View v) {
    if ((com.aiworker.bcineuroskyservice.MainActivity.layer) == 2) {
        switchToLayer1();
    }
    if ((com.aiworker.bcineuroskyservice.MainActivity.layer) == 3) {
        switchToLayer2from3();
    }
}