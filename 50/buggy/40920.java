public void setBirthday(java.time.LocalDate birthday) {
    this.birthday = birthday;
    setLastUpdatedAt(java.time.LocalDateTime.now());
}