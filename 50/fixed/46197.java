public org.fluentlenium.assertj.custom.FluentWebElementAssert hasNotText(final java.lang.String textToFind) {
    if (actual.text().contains(textToFind)) {
        failWithMessage(("The element contain the text: " + textToFind));
    }
    return this;
}