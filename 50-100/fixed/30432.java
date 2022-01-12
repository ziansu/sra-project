@org.junit.Test
public void delete() throws java.lang.Exception {
    final com.enonic.xp.snapshot.DeleteSnapshotsResult deleteResult = com.enonic.xp.snapshot.DeleteSnapshotsResult.create().add("snapshot1").build();
    org.mockito.Mockito.when(this.nodeService.deleteSnapshot(org.mockito.Matchers.isA(com.enonic.xp.snapshot.DeleteSnapshotParams.class))).thenReturn(deleteResult);
    final java.lang.String result = request().path("repo/delete").entity(readFromFile("delete_params.json"), MediaType.APPLICATION_JSON_TYPE).post().getAsString();
    assertJson("delete.json", result);
}