@java.lang.Override
public void addDateHeader(java.lang.String name, long date) {
    addHeader(name, utils.FastHttpDateFormat.formatDate(date, null));
}