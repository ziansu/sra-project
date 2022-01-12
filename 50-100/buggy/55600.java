public void setDate(java.time.LocalDate date) {
    if ((dateTime.get()) == null) {
        java.time.LocalDateTime temp = java.time.LocalDateTime.of(date, dateTime.get().toLocalTime());
        this.dateTime = new javafx.beans.property.SimpleObjectProperty<java.time.LocalDateTime>(temp);
    }
}