public void setDueDate(java.util.Date dueDate) {
    if ((this.dueDate) == null) {
        this.dueDate = null;
    }else {
        this.dueDate.setTime(dueDate);
    }
}