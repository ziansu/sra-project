public java.util.Calendar getDueDate() {
    assert !(_isFloating) : "Trying to get due date from a full day task";
    if (!(_isFloating)) {
        return _dueDate;
    }else {
        return null;
    }
}