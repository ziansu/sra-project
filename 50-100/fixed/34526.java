private static com.codeborne.selenide.Condition attribute(final java.lang.String attributeName, final java.lang.String expectedAttributeValue, final boolean trim) {
    return new com.codeborne.selenide.Condition("attribute") {
        @java.lang.Override
        public boolean apply(org.openqa.selenium.WebElement element) {
            return expectedAttributeValue.equals(com.codeborne.selenide.Condition.getAttributeValue(element, attributeName, trim));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((((name) + " ") + attributeName) + '=') + expectedAttributeValue;
        }
    };
}