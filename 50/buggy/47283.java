public void setTextToField(java.lang.String textFieldId, java.lang.String text) {
    setText(driver.findElement(org.openqa.selenium.By.id(textFieldId)), text);
}