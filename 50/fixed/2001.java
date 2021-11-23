public void loadEvent(int year, int month, int day) {
    currentCCYY = year;
    currentMM = month + 1;
    currentDD = day;
    loadFromSQL();
}