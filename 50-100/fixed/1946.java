@org.junit.Test
public void testStreaming() throws java.io.IOException {
    io.crate.metadata.UsersPrivilegesMetaData usersPrivilegesMetaData = new io.crate.metadata.UsersPrivilegesMetaData(usersPrivileges);
    org.elasticsearch.common.io.stream.BytesStreamOutput out = new org.elasticsearch.common.io.stream.BytesStreamOutput();
    usersPrivilegesMetaData.writeTo(out);
    org.elasticsearch.common.io.stream.StreamInput in = out.bytes().streamInput();
    io.crate.metadata.UsersPrivilegesMetaData usersPrivilegesMetaData2 = new io.crate.metadata.UsersPrivilegesMetaData(in);
    assertEquals(usersPrivilegesMetaData, usersPrivilegesMetaData2);
}