public void setSegmentation() {
    segmentation = new java.util.HashMap<>();
    segmentation.put("message", com.playseeds.android.sdk.Seeds.sharedInstance().getMessageVariantName());
    segmentation.put("context", com.playseeds.android.sdk.Seeds.sharedInstance().getMessageContext());
}