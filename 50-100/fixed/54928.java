@java.lang.Override
public com.eucalyptus.auth.policy.ern.Ern build(final java.lang.String ern, final java.lang.String service, final java.lang.String region, final java.lang.String account, final java.lang.String resource) throws net.sf.json.JSONException {
    final java.util.regex.Matcher matcher = com.eucalyptus.simplequeue.common.policy.SimpleQueueErnBuilder.RESOURCE_PATTERN.matcher(resource);
    if (matcher.matches()) {
        return new com.eucalyptus.simplequeue.common.policy.SimpleQueueResourceName(region, account, resource);
    }
    throw new net.sf.json.JSONException((("'" + ern) + "' is not a valid ARN"));
}