@javax.validation.constraints.AssertTrue(message = "Start date should not greater than End date")
public boolean isStartDateBelowEndDate() {
    if (((startDate) != null) && ((endDate) != null)) {
        return (startDate.before(endDate)) || (startDate.equals(endDate));
    }
    return true;
}