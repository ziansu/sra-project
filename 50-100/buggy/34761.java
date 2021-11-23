public void setEndDate(java.util.Optional<java.util.List<java.util.Date>> endDate) {
    try {
        java.util.List<java.util.Date> dateList = endDate.get();
        if ((dateList.size()) == 2) {
            this.endDate = java.util.Optional.of(endDate.get().get(1));
        }else {
            this.endDate = java.util.Optional.empty();
        }
    } catch (java.util.NoSuchElementException nse) {
        throw new java.lang.IllegalArgumentException();
    }
}