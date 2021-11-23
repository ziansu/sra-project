public void updateLastLogin(java.lang.String player) {
    java.util.Date today = java.util.Calendar.getInstance().getTime();
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MMM/yy");
    java.lang.String lastlogin = ((java.util.Calendar.getInstance().getTimeInMillis()) + ",") + (formatter.format(today));
    whitelist.setProperty((player + ".dates.lastlogin"), lastlogin);
    whitelist.save();
}