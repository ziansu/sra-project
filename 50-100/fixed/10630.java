public boolean validateDayOfWeek(java.time.LocalDateTime currentTime) {
    application.main.Business business = new application.main.Business();
    for (int i = 0; i < (business.getOpeningDays().size()); i++) {
        if (business.getOpeningDays().get(i).equals(currentTime.getDayOfWeek())) {
            application.main.Utility.LOGGER.info("Valid business time");
            return true;
        }
    }
    application.main.Utility.LOGGER.info("Invalid business time");
    return false;
}