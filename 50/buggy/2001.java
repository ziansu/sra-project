public void loadEvent(int year, int month, int day) {
    currentCCYY = year;
    currentMM = month;
    currentDD = day;
    loadFromSQL();
}