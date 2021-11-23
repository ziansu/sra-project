@java.lang.Override
protected void configure() {
    bindListener(com.google.inject.matcher.Matchers.any(), count1);
    bindListener(com.google.inject.matcher.Matchers.any(), count2);
}