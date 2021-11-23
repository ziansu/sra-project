@Parameterized.Parameters(name = "throwable:{0}, version:{1}")
public static java.lang.Iterable<java.lang.Object[]> parameters() {
    java.util.LinkedList<java.lang.Object[]> parameters = new java.util.LinkedList<java.lang.Object[]>();
    for (java.lang.String version : com.hazelcast.client.protocol.compatibility.ErrorCodecCompatibilityTest.versions) {
        for (java.lang.Throwable throwable : com.hazelcast.client.protocol.compatibility.ErrorCodecCompatibilityTest.throwables.get(version)) {
            parameters.add(new java.lang.Object[]{ throwable , version });
        }
    }
    return parameters;
}