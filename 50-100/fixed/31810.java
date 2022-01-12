public boolean isValid() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.util.Calendar regcal = java.util.Calendar.getInstance();
    java.util.Calendar endcal = java.util.Calendar.getInstance();
    java.util.Date regdate;
    regdate = new java.util.Date(regtime);
    regcal.setTime(regdate);
    endcal.setTime(regdate);
    endcal.add(java.util.Calendar.MILLISECOND, timeout);
    return (cal.before(endcal)) && (cal.after(regcal));
}