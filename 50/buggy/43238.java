private void refreshDetailsFragment(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    android.util.Log.d(com.example.test.samplemasterdetail.MainActivity.TAG, "refreshDetailsFragment: ");
    if ((mDetailsFragment) != null) {
        mDetailsFragment.refreshDetails(relatedTopic);
    }
}