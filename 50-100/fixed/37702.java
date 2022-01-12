public java.lang.String getCreationDate() {
    if (hasCreationDate()) {
        int start = 0;
        if (hasPriority()) {
            start += com.leosko.todotxt_gdrive.model.Task.PRIORITY_LENGTH;
        }
        if (isComplete()) {
            start += com.leosko.todotxt_gdrive.model.Task.COMPLETION_LENGTH;
        }
        return text.substring(start, ((start + (com.leosko.todotxt_gdrive.model.Task.DATE_LENGTH)) - 1));
    }else {
        return "";
    }
}