public final void setEndDate(java.util.Date endDate) {
    if (!(this.endDate.equals(endDate))) {
        if (((endDate != null) && ((startDate) != null)) && (endDate.before(startDate))) {
            throw new de.invation.code.toval.validate.ParameterException("The start date must be before the end date of the filter.");
        }
        this.endDate = endDate;
        de.uni.freiburg.iig.telematik.sewol.log.filter.TimeFilter.setChanged();
        de.uni.freiburg.iig.telematik.sewol.log.filter.TimeFilter.notifyObservers();
    }
}