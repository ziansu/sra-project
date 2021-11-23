public S hasStartTime(long time) {
    org.assertj.android.api.view.animation.AbstractAnimationAssert.isNotNull();
    long actualTime = actual.getStartTime();
    org.assertj.android.api.view.animation.AbstractAnimationAssert.assertThat(actualTime).overridingErrorMessage("Expected start time <%s> but was <%s>.", time, actualTime).isEqualTo(time);
    return myself;
}