java.util.Date formatDate(java.lang.String date) throws java.text.ParseException {
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");
    java.util.Date date1;
    date1 = df.parse(date);
    android.util.Log.e("asdasda", (date1 + " "));
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("LLL dd, yyyy");
    java.lang.String formattedDate = dateFormat.format(date1);
    return date1;
}