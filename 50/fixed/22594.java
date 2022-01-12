public void setTijdstip(java.lang.String tijdstip) {
    java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    java.util.Date today = java.util.Calendar.getInstance().getTime();
    this.tijdstip = df.format(today);
}