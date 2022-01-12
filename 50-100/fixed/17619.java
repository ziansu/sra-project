@javax.persistence.Transient
public java.lang.Integer getLastDateNum() {
    if ((this.shouldDate) != null) {
        java.util.Calendar c1 = java.util.Calendar.getInstance();
        c1.setTime(this.shouldDate);
        java.util.Calendar now = java.util.Calendar.getInstance();
        now.setTime(new java.util.Date());
        int check = now.compareTo(c1);
        int c = 5 - check;
        if (c < 0) {
            return 0;
        }else {
            return c;
        }
    }
    return lastDateNum;
}