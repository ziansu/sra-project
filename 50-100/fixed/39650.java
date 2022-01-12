public void setSegmentation() {
    segmentation = new java.util.HashMap<>();
    segmentation.put("message", com.playseeds.android.sdk.Seeds.sharedInstance().getMessageVariantName());
    if ((com.playseeds.android.sdk.Seeds.sharedInstance().getMessageContext()) != null) {
        segmentation.put("context", com.playseeds.android.sdk.Seeds.sharedInstance().getMessageContext());
    }
}