@java.lang.Override
void decodeAttributeBody(byte[] attributeValue, char offset, char length) {
    while ((length > 0) && ((attributeValue[length]) == 0)) {
        length--;
    } 
    username = new byte[length];
    java.lang.System.arraycopy(attributeValue, offset, username, 0, length);
}