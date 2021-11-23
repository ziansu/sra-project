private void showMessageWithParam(java.lang.String key, java.lang.Object[] params) {
    java.lang.String message = java.util.ResourceBundle.getBundle("Messages", locale).getString(key);
    java.lang.System.out.println(((message + " ") + (params[0])));
}