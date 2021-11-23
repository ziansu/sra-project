public org.joda.time.Duration getEstimatedTime(@android.support.annotation.NonNull
org.cook_e.data.Step s) {
    org.cook_e.data.Objects.requireNonNull(s, "step must not be null");
    int index = searchStep(s.hashCode());
    if (index >= 0) {
        long time = ((long) ((s.getTime().getMillis()) * (org.cook_e.data.TimeLearner.weightList.get(index).timeWeight)));
        return new org.joda.time.Duration(time);
    }
    return s.getTime().toDuration();
}