public java.time.LocalDateTime dateConvert(java.lang.String data) {
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    if (!(isNotEmpty(data).equalsIgnoreCase(ok)))
        try {
            throw new lv.javaguru.java2.database.DBException("Empty field, LDT - now");
        } catch (lv.javaguru.java2.database.DBException e) {
            java.lang.String date = java.time.LocalDateTime.now().format(formatter);
            return java.time.LocalDateTime.parse(date, formatter);
        }
    
    java.time.LocalDateTime dateTime = java.time.LocalDateTime.parse(data, formatter);
    return dateTime;
}