public void setTijdstip(java.lang.String tijdstip) {
    java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    java.util.Date today = java.util.Calendar.getInstance().getTime();
    java.lang.String tijdstip = df.format(today);
    this.tijdstip = tijdstip;
}