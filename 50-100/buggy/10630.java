public boolean validateDayOfWeek(java.time.LocalDateTime currentTime) {
    application.main.Business business = new application.main.Business();
    for (int i = 0; i < (business.getOpeningDays().length); i++) {
        if (business.getOpeningDays()[i].equals(currentTime.getDayOfWeek())) {
            application.main.Utility.LOGGER.info("Valid business time");
            return true;
        }
    }
    application.main.Utility.LOGGER.info("Invalid business time");
    return false;
}