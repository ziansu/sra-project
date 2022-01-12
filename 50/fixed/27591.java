@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsEmptyString() {
    assertTrue(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("")));
}