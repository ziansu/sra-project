public java.util.List<painpoint.domain.painpoint.model.PainPoint> getThumbsDownList() {
    java.util.List<painpoint.domain.painpoint.model.PainPoint> thumbsDown = new java.util.ArrayList<painpoint.domain.painpoint.model.PainPoint>();
    for (painpoint.domain.painpoint.model.PainPoint painPoint : mPainPoints) {
        if (painPoint.isThumbsDown()) {
            thumbsDown.add(painPoint);
        }
    }
    return thumbsDown;
}