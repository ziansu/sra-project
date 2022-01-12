public boolean isThereAnyBirthDayToday() {
    boolean anyBirthDayToday;
    this.updateSettings();
    if ((this.contactList.size()) == 0) {
        anyBirthDayToday = scanBirthDaysNowFromCursor();
    }else {
        anyBirthDayToday = scanBirthDaysNowFromList();
    }
    return anyBirthDayToday;
}