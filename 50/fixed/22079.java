public void setEncodersCollection(java.util.Collection<org.mythtv.android.presentation.model.EncoderModel> encodersCollection) {
    this.validateEncodersCollection(encodersCollection);
    this.encodersCollection = new java.util.ArrayList(encodersCollection);
    this.notifyDataSetChanged();
}