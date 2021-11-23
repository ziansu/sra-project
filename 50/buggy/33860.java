private void launchDetailsActivity(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    android.util.Log.d(com.example.test.samplemasterdetail.MainActivity.TAG, "launchDetailsActivity: ");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.test.samplemasterdetail.DetailsActivity.class);
    intent.putExtra(com.example.test.samplemasterdetail.MainActivity.DETAILS_KEY, relatedTopic);
    startActivity(intent);
}