public final void setStartDate(java.util.Date startDate) {
    if (((this.startDate) == null) || (!(this.startDate.equals(startDate)))) {
        if (((startDate != null) && ((endDate) != null)) && (endDate.before(startDate))) {
            throw new de.invation.code.toval.validate.ParameterException("The start date must be before the end date of the filter.");
        }
        this.startDate = startDate;
        de.uni.freiburg.iig.telematik.sewol.log.filter.TimeFilter.setChanged();
        de.uni.freiburg.iig.telematik.sewol.log.filter.TimeFilter.notifyObservers();
    }
}