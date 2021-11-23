@javax.validation.constraints.AssertTrue(message = "Start date should not greater than End date")
public boolean isStartDateBelowEndDate() {
    return (startDate.before(endDate)) || (startDate.equals(endDate));
}