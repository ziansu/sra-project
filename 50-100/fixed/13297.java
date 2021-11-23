private void downVote() {
    this.product.setTrustScore(((this.product.getTrustScore()) - 1));
    android.content.Intent intent = new android.content.Intent(activity, com.apps4better.recycle4better.model.ProductEditorService.class);
    intent.putExtra(ProductEditorService.TAG_PRODUCT, this.product);
    activity.startService(intent);
    this.pTrustText.setText(java.lang.String.valueOf(product.getTrustScore()));
}