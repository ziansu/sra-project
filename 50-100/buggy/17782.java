private void setCheckBoxValue(org.openqa.selenium.WebElement checkBox, boolean doYouWantToSelectCheckbox) {
    if (doYouWantToSelectCheckbox == true) {
        if (!(checkBox.isSelected())) {
            checkBox.click();
        }
    }else {
        if (!(checkBox.isSelected())) {
            checkBox.click();
        }
    }
}