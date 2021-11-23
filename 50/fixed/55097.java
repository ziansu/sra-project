public void checkIfAgendaViewIsVisible() {
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBeMoreThan(agendaList, 0));
}