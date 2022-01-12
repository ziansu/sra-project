@java.lang.Override
protected void onImageResult(java.lang.String mediaType, android.net.Uri imageUri, java.lang.String imagePath) {
    simpleDraweeView.setImageURI(imageUri);
    this.mediaType = mediaType;
    this.imagePath = imagePath;
    org.gem.indo.dooit.helpers.crashlytics.CrashlyticsHelper.log(this.getClass().getSimpleName(), "onImageResult", "a successful image result (onboarding)");
}