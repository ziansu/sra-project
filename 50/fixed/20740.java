public java.util.Collection<java.lang.String> getPrivateIpAddresses() throws java.lang.Exception {
    final java.util.Map<java.lang.String, java.lang.String> result = new com.hazelcast.aws.impl.DescribeInstances(awsConfig).execute();
    return result.keySet();
}