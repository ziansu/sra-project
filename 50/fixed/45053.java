private boolean isAfterNotAfter() {
    java.util.Date today = new java.util.Date();
    if (today.after(certificate.getNotAfter())) {
        return true;
    }else {
        return false;
    }
}