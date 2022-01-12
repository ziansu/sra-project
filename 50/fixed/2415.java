@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getMessageHistory() {
    return getMessageString(getMessageSet(warnings, messages, exceptions));
}