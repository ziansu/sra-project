public java.lang.String toCardString() {
    if (endtime.getTime().equals(new java.util.Date(0))) {
        return "-";
    }else {
        java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy hh:mm a");
        java.util.Date endTimeString = endtime.getTime();
        java.lang.String finalEndString = df.format(endTimeString);
        return finalEndString;
    }
}