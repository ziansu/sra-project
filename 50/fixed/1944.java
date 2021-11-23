public void postTagEvent(java.lang.String tag, java.lang.Object event) {
    post(new org.greenrobot.eventbus.TagEvent(tag, event, false));
}