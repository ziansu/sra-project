private void clickBeacon() {
    wifiButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent beacon = new android.content.Intent(com.lynxspa.androidadvanced201617.Activities.CreaProfilo.this, com.lynxspa.androidadvanced201617.Activities.ListaBeacon.class);
            startActivity(beacon);
        }
    });
}