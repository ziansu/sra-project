protected static boolean containsText(com.codeborne.selenide.SelenideElement elementToFindText, java.lang.String textToFind) {
    return elementToFindText.getText().toLowerCase().contains(textToFind.toLowerCase());
}