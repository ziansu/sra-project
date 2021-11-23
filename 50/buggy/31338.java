@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNull() {
    org.junit.Assert.assertTrue(fact.isBlank(((eu.europa.fisheries.uvms.rules.service.TextType) (null))));
}