@org.junit.Test
public void testUsersMetaDataStreaming() throws java.io.IOException {
    io.crate.metadata.UsersMetaData users = new io.crate.metadata.UsersMetaData(com.google.common.collect.ImmutableList.of("Trillian"));
    org.elasticsearch.common.io.stream.BytesStreamOutput out = new org.elasticsearch.common.io.stream.BytesStreamOutput();
    users.writeTo(out);
    org.elasticsearch.common.io.stream.StreamInput in = out.bytes().streamInput();
    io.crate.metadata.UsersMetaData users2 = ((io.crate.metadata.UsersMetaData) (new io.crate.metadata.UsersMetaData().readFrom(in)));
    assertEquals(users, users2);
}