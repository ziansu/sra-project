public void checkIfAgendaViewIsVisible() {
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBeMoreThan(org.openqa.selenium.By.className(agendaList), 0));
}