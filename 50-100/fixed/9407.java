public void selectPatient(java.lang.String Patient) {
    org.openqa.selenium.WebElement lastElement = null;
    for (org.openqa.selenium.WebElement patient : patient_list) {
        if ((patient.findElement(org.openqa.selenium.By.cssSelector(".patient-id")).getText().contains(Patient)) || (patient.findElement(org.openqa.selenium.By.cssSelector(".patient-name")).getText().contains(Patient))) {
            lastElement = patient;
        }
    }
    if (lastElement != null)
        lastElement.click();
    
    return ;
}