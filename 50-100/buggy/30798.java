public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (requestCode == (REQUEST_IMAGE_CAPTURE)) {
        if (resultCode == (RESULT_OK)) {
            java.io.File image = ((java.io.File) (intent.getSerializableExtra("file")));
            submission.image = image;
            android.content.Intent submitIntent = new android.content.Intent(this, org.drl.lutz.sosmehringplatzapp.main.activities.UploadActivity.class);
            submitIntent.putExtra("submission", submission);
            startActivity(submitIntent);
            finish();
        }else {
            this.recreate();
        }
    }
}