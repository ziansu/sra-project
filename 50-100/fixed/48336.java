public static java.time.LocalDateTime parseString(java.lang.String date) {
    if ((date == null) || (date.isEmpty())) {
        return null;
    }
    if ((service.validator.Validator.dateValidate(date)) == null) {
        if (date.matches(service.validator.Validator.REGEX_DATE)) {
            return model.computer.Computer.toLocalDateTime(date);
        }else {
            return model.computer.Computer.toLocalDateTime2(date);
        }
    }
    return null;
}