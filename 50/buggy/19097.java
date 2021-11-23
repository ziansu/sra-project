public void refreshNamazTimeIfDateChange() {
    mPresentDate = getDate();
    java.lang.System.out.println(mPresentDate);
    java.lang.System.out.println(getDate());
    if (!(mPresentDate.equals(getDate()))) {
        setTimesFromDatabase(true);
    }
}