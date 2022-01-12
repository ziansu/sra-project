private boolean isValidDateTimePair() {
    if ((openTime.getDateTimeValue().isPresent()) && (closeTime.getDateTimeValue().isPresent())) {
        java.time.Instant openTimeValue = openTime.getDateTimeValue().get();
        java.time.Instant closeTimeValue = closeTime.getDateTimeValue().get();
        return openTimeValue.isBefore(closeTimeValue);
    }else {
        return true;
    }
}