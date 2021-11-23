@java.lang.Override
public boolean isValidClientInformation() {
    return (((oldestid) >= 0) && ((currentId) >= 0)) && (clientDescriptor.isValid());
}