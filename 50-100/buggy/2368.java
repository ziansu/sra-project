public java.lang.String getFormattedTimeAndDate(boolean includeDate) {
    assert (includeDate == true) || (includeDate == false);
    java.lang.String result = main.java.Task.STRING_EMPTY;
    if ((getStartTime()) != null) {
        result += (addFormattedTime()) + (main.java.Task.STRING_EMPTY_SPACE);
    }
    if (includeDate) {
        result += addFormattedDate();
    }
    return result.trim();
}