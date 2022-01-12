@java.lang.Override
public int getSize() {
    if ((((size) == 0) && ((content) == null)) && ((text) != null)) {
        size = getMinimumMessageSize();
        if ((marshalledProperties) != null) {
            size += marshalledProperties.getLength();
        }
        size += (text.length()) * 2;
    }
    return super.getSize();
}