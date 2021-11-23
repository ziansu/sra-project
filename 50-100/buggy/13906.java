public boolean currentUserHasPainPoint() {
    java.util.List<painpoint.domain.painpoint.model.PainPoint> painPoints = getThumbsDownList();
    for (painpoint.domain.painpoint.model.PainPoint painPoint : painPoints) {
        if ((painPoint.isThumbsDown()) && (painPoint.getId().equals(getPainPointId()))) {
            return true;
        }
    }
    return false;
}