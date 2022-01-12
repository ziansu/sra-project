@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getVerboseMessageHistory() {
    return getMessageString(getMessageSet(warnings, messages, verboseMessages, exceptions));
}