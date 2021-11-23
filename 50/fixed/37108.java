public void initJNI() {
    if ((jniCommunicator) == null) {
        jniCommunicator = new com.inaetics.demonstrator.JNICommunicator(handler);
    }
}