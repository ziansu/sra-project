public java.lang.String statusUpdate() {
    java.lang.StringBuilder status = new java.lang.StringBuilder();
    for (codeu.chat.util.Uuid user : followees.keySet()) {
        status.append(followees.get(user).statusUpdate());
    }
    return status.toString();
}