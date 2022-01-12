public java.lang.String getStartTime() {
    java.util.Date tempDate = date.getTime();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
    java.lang.System.out.println(sdf.format(tempDate));
    return sdf.format(tempDate);
}