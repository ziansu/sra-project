@java.lang.Override
protected void onPostExecute(com.microsoft.projectoxford.face.contract.Face[] faces) {
    java.lang.String faceId = faces[0].faceId.toString();
    if (faceId != null) {
        currFaceId = faceId;
        android.content.Intent mainIntent = new android.content.Intent(this, brockbadgers.flock.MainActivity.class);
        mainIntent.putExtra(getString(R.string.user_id), currFaceId);
        this.startActivity(mainIntent);
        dialog.hide();
        finish();
    }
}