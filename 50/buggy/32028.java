public java.lang.String generateSubscriptionId() {
    if (java.lang.Integer.toString(org.opendaylight.yangpushserver.subscription.SubscriptionEngine.sub_id).equals("-1")) {
        org.opendaylight.yangpushserver.subscription.SubscriptionEngine.sub_id = 0;
    }
    (this.sub_id)++;
    return java.lang.Integer.toString(this.sub_id);
}