public java.sql.Date getTodayDate() {
    java.time.LocalDate today = java.time.LocalDate.now();
    return java.sql.Date.valueOf(today);
}