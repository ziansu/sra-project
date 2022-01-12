private void traceCall(java.lang.String method, java.lang.String[] arguments) {
    try {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(filename, true);
        fos.write((((('\t' + method) + '(') + (java.lang.String.join(", ", arguments))) + ')').getBytes());
        fos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}