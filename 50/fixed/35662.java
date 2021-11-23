@java.lang.Override
public boolean match(java.lang.Object matchValue, java.lang.String bucketingKey, java.util.Map<java.lang.String, java.lang.Object> attributes, io.split.client.SplitClientImpl splitClient) {
    boolean result = _delegate.match(matchValue, bucketingKey, attributes, splitClient);
    return _negate ? !result : result;
}