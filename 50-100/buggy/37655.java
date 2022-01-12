public java.lang.String clickTheFirstCheckBoxOfRecordingsByIndex(int index) {
    java.util.List<java.lang.String> recording_names_list = getCourseRecordingList();
    java.lang.String checkbox_indexed = "Checkbox" + index;
    com.automation.main.page_helpers.WebElement checkBox = driver.findElement(com.automation.main.page_helpers.By.id(checkbox_indexed));
    if (!(checkBox.isSelected())) {
        checkBox.click();
        return recording_names_list.get(index);
    }
    return null;
}