public java.lang.String statusUpdate() {
    java.lang.StringBuilder status = new java.lang.StringBuilder();
    java.lang.System.out.println(this);
    for (codeu.chat.util.Uuid user : followees.keySet()) {
        status.append(followees.get(user).statusUpdate());
    }
    return status.toString();
}