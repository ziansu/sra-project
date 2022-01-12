@java.lang.Override
public void setSubmitDate(java.util.Date d) {
    if (d == null) {
        this.submitDate = null;
    }else {
        this.submitDate = new java.util.Date(d.getTime());
    }
}