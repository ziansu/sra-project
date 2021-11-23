public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.tberroa.girodicerapp.activities.RegisterActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).setAction(Params.RELOAD);
    startActivity(intent);
    finish();
}