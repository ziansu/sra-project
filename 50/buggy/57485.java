public void actionPerformed(java.awt.event.ActionEvent e) {
    storeYear();
    if ((Records.CachedCalendar.getInstance().Month) == 2) {
        resetDayBox();
    }
}