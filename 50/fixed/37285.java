private void swapDates() {
    if (startDate.after(endDate)) {
        java.util.Calendar temp = endDate;
        endDate = startDate;
        startDate = temp;
    }
}