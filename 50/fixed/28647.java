@org.junit.Test
public final void testToStringOneKeyMultipleText() {
    messages.addMessages(Severity.ERROR, uk.co.bluegecko.core.model.MessagesTest.KEY_1, uk.co.bluegecko.core.model.MessagesTest.MESSAGE_1, uk.co.bluegecko.core.model.MessagesTest.MESSAGE_2);
    org.junit.Assert.assertThat(messages.toString(), org.hamcrest.Matchers.is("MessagesBase[\n\tERROR\tfoo1 : bar1; bar2\n]"));
}