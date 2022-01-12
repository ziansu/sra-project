public java.util.Map<java.lang.String, java.lang.String> execute() throws java.lang.Exception {
    final java.lang.String signature = rs.sign("ec2", attributes);
    attributes.put("X-Amz-Signature", signature);
    java.io.InputStream stream = callService(endpoint, signature);
    return com.hazelcast.aws.utility.CloudyUtility.unmarshalTheResponse(stream, awsConfig);
}