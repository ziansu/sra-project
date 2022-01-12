public boolean isThereAnyBirthDayToday() {
    boolean anyBirthDayToday = false;
    this.updateSettings();
    if ((this.contactList.size()) == 0) {
        anyBirthDayToday = scanBirthDaysNowFromCursor();
    }else {
        anyBirthDayToday = scanBirthDaysNowFromList();
    }
    return anyBirthDayToday;
}