@java.lang.Override
protected void onResume() {
    super.onResume();
    mButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            com.afollestad.digitus.Digitus.get().startListening();
        }
    });
    com.afollestad.digitus.Digitus.init(this, getString(R.string.app_name), 69, this);
}