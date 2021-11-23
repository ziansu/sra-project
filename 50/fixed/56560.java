public java.util.Calendar getDueDate() {
    if (!(_isFloating)) {
        return _dueDate;
    }else {
        java.lang.System.out.println("Trying to get due date from a full day task");
        return null;
    }
}