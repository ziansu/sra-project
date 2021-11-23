public void refreshDetails(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    mTextView.setText(relatedTopic.getText());
    android.util.Log.d(com.example.test.samplemasterdetail.fragments.DetailsFragment.TAG, ("refreshDetails: " + (mTextView)));
}