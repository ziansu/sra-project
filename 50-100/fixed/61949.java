@org.junit.Test
public void duplicateColumn() {
    expectedException.expect(java.lang.IllegalStateException.class);
    expectedException.expectMessage("Duplicate column");
    com.google.cloud.spanner.Mutation.newInsertBuilder("T1").set("C1").to(true).set("C1").to(false).build();
}