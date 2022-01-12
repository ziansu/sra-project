@java.lang.Override
protected boolean onBalloonTap(int index, com.google.android.maps.OverlayItem item) {
    if (item instanceof nu.placebo.whatsup.model.ExtendedOverlayItem) {
        android.content.Intent startAnnotation = new android.content.Intent(activity, nu.placebo.whatsup.activity.AnnotationActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("nid", ((nu.placebo.whatsup.model.ExtendedOverlayItem) (item)).getId());
        startAnnotation.putExtras(bundle);
        activity.startActivity(startAnnotation);
    }
    return true;
}