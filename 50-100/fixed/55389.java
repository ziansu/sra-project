public static org.openintents.smime.ParcelFileDescriptorUtil.TransferThread pipeTo(java.io.OutputStream outputStream, android.os.ParcelFileDescriptor output) throws java.io.IOException {
    android.os.ParcelFileDescriptor[] pipe = android.os.ParcelFileDescriptor.createPipe();
    android.os.ParcelFileDescriptor readSide = pipe[0];
    android.os.ParcelFileDescriptor writeSide = pipe[1];
    org.openintents.smime.ParcelFileDescriptorUtil.TransferThread t = new org.openintents.smime.ParcelFileDescriptorUtil.TransferThread(new android.os.ParcelFileDescriptor.AutoCloseInputStream(output), outputStream);
    t.start();
    return t;
}