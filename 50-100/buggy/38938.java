public void setBirthDate(java.lang.String birthDate, java.lang.String dateFormat) {
    dateFormatter = java.time.format.DateTimeFormatter.ofPattern(dateFormat);
    if (birthDate == null) {
        this.birthDate = null;
    }else {
        this.birthDate = java.time.LocalDate.parse(birthDate, dateFormatter);
    }
}