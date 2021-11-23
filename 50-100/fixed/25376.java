@java.lang.Override
public void onClick(android.view.View v) {
    locationProvider.checkLocationSettings(locationRequest, true).subscribe(new rx.functions.Action1<java.lang.Boolean>() {
        @java.lang.Override
        public void call(java.lang.Boolean success) {
            checkLocationSettingsView.setText((success ? "Location settings changed/already appropriate for location request." : "Location settings did not change."));
        }
    });
}