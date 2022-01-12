@javax.persistence.Transient
public java.lang.Integer getLastDateNum() {
    if ((this.shouldDate) != null) {
        java.util.Calendar c1 = java.util.Calendar.getInstance();
        c1.setTime(this.shouldDate);
        java.util.Calendar now = java.util.Calendar.getInstance();
        int check = now.compareTo(c1);
        return 5 - check;
    }
    return lastDateNum;
}