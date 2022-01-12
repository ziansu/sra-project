public boolean isExpired() {
    return new java.util.Date().after(expiryDate);
}