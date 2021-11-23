private void advanceToBusinessOpenIfNeeded() {
    if (cursor.toLocalTime().isBefore(businessOpen)) {
        cursor = java.time.LocalDateTime.of(cursor.toLocalDate(), businessOpen);
    }
}