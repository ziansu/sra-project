private <T> T getValue(T value, T defaultValue) {
    return value != null ? value : defaultValue;
}