@org.junit.Test
public void execute_add_invalidTaskData() throws java.lang.Exception {
    assertCommandBehavior("add []\\[;]", Description.MESSAGE_DESCRIPTION_CONSTRAINTS);
    assertCommandBehavior("add Valid DESCRIPTION by no-valid-date", Description.MESSAGE_DESCRIPTION_CONSTRAINTS);
    assertCommandBehavior("add Valid Description t/invalid_-[.tag", Tag.MESSAGE_TAG_CONSTRAINTS);
}