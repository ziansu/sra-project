private boolean isValidDateTimePair(seedu.task.model.task.DateTime openTime, seedu.task.model.task.DateTime closeTime) {
    if ((openTime.getDateTimeValue().isPresent()) && (openTime.getDateTimeValue().isPresent())) {
        java.time.Instant openTimeValue = openTime.getDateTimeValue().get();
        java.time.Instant closeTimeValue = openTime.getDateTimeValue().get();
        return openTimeValue.isBefore(closeTimeValue);
    }else {
        return true;
    }
}