private void showMessageWithParam(java.lang.String key, java.lang.Object[] params) {
    java.lang.String message = java.util.ResourceBundle.getBundle("Messages", locale).getString(key);
    for (java.lang.Object param : params) {
        message += param;
    }
    java.lang.System.out.println(message);
}