public void setStartDate(java.util.Optional<java.util.List<java.util.Date>> startDate) {
    try {
        java.util.List<java.util.Date> dateList = startDate.get();
        if ((dateList.size()) == 2) {
            this.startDate = java.util.Optional.of(startDate.get().get(0));
        }else {
            throw new java.util.NoSuchElementException();
        }
    } catch (java.util.NoSuchElementException nse) {
        this.startDate = java.util.Optional.empty();
    }
}