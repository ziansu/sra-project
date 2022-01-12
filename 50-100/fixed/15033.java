private void validateNotTooFarInTheFuture(org.joda.time.DateMidnight date, org.springframework.validation.Errors errors) {
    org.synyx.urlaubsverwaltung.core.settings.Settings settings = settingsService.getSettings();
    java.lang.Integer maximumMonths = settings.getMaximumMonthsToApplyForLeaveInAdvance();
    org.joda.time.DateMidnight future = org.joda.time.DateMidnight.now().plusMonths(maximumMonths);
    if (date.isAfter(future)) {
        errors.reject(org.synyx.urlaubsverwaltung.web.validator.ApplicationValidator.ERROR_TOO_LONG, new java.lang.Object[]{ settings.getMaximumMonthsToApplyForLeaveInAdvance().toString() }, null);
    }
}