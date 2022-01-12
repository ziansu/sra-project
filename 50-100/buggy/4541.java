public java.util.List<java.lang.String> convertListElementToListOfElementText(java.util.List<org.openqa.selenium.WebElement> elements) {
    java.util.List<java.lang.String> texts = new java.util.ArrayList<>();
    for (org.openqa.selenium.WebElement webElement : elements) {
        texts.add(webElement.getText().toLowerCase());
    }
    return texts;
}