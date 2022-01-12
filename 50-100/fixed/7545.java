@org.junit.Test
public void testRegexInstanceChangeRegexWithInstances() {
    ai.grakn.concept.Resource<java.lang.String> thing = resourceType.putResource("1");
    expectedException.expect(ai.grakn.exception.InvalidConceptValueException.class);
    expectedException.expectMessage(ErrorMessage.REGEX_INSTANCE_FAILURE.getMessage("[abc]", thing.getId(), thing.getValue(), resourceType.getName()));
    resourceType.setRegex("[abc]");
}