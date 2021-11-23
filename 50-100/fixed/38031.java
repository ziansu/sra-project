public void show() {
    m_view.setVisibility(View.VISIBLE);
    m_view.requestFocus();
    m_poiImage.setImageResource(R.drawable.image_blank);
    m_title.setText("");
    m_description.setText("");
    m_shouldShareButton.setChecked(m_hasNetworkConnectivity);
    m_currentImageUri = null;
    m_awaitingIntentResponse = false;
}