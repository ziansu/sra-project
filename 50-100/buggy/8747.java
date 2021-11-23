public void setStartDate(java.util.Optional<java.util.List<java.util.Date>> startDate) {
    try {
        java.util.List<java.util.Date> dateList = startDate.get();
        if ((dateList.size()) == 2) {
            this.startDate = java.util.Optional.of(startDate.get().get(0));
        }else {
            this.startDate = java.util.Optional.empty();
        }
    } catch (java.util.NoSuchElementException nse) {
        throw new java.lang.IllegalArgumentException();
    }
}