private void setTopic(java.lang.String topic) {
    if (null != (this.getActionBar())) {
        this.getActionBar().setSubtitle(topic);
    }
}