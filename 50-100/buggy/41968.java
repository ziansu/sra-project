@org.junit.Test
public void duplicateColumnCaseInsensitive() {
    expectedException.expect(java.lang.IllegalStateException.class);
    expectedException.expectMessage("Duplicate column");
    com.google.cloud.spanner.Mutation m = com.google.cloud.spanner.Mutation.newInsertBuilder("T1").set("C1").to(true).set("c1").to(false).build();
}