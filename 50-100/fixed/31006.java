void openActivity(java.lang.String text) {
    android.content.Intent mIntent = new android.content.Intent(com.pollux.sherpa.utils.MyApplication.context, com.pollux.sherpa.DetailsActivity.class);
    mIntent.putExtra(DetailsActivity.BUNDLE_MESSAGE, text);
    mIntent.addFlags((((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP)) | (android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)));
    startActivity(mIntent);
}