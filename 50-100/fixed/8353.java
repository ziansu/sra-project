@java.lang.Override
public void onMessage(int instanceId, java.lang.String message) {
    int size = java.lang.Integer.parseInt(message);
    byte[] buffer = new byte[size];
    for (int i = 0; i < size; ++i)
        buffer[i] = 'p';
    
    java.lang.String result = new java.lang.String(buffer);
    postMessage(instanceId, result);
}