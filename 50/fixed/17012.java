private void startStageProject() {
    android.content.Intent intent = new android.content.Intent(this, org.catrobat.catroid.stage.PreStageActivity.class);
    startActivityForResult(intent, PreStageActivity.REQUEST_RESOURCES_INIT);
}