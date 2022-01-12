@java.lang.Override
public void onMessage(int instanceId, java.lang.String message) {
    int size = java.lang.Integer.parseInt(message);
    byte[] buffer = new byte[size + 1];
    for (int i = 0; i < size; ++i)
        buffer[i] = 'p';
    
    buffer[size] = 0;
    byte[] encodedBufer = org.apache.commons.codec.binary.Base64.encodeBase64(buffer);
    java.lang.String result = new java.lang.String(encodedBufer);
    postMessage(instanceId, result);
}