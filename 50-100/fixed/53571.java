public static android.os.ParcelFileDescriptor pipeFrom(java.io.InputStream inputStream) throws java.io.IOException {
    android.os.ParcelFileDescriptor[] pipe = android.os.ParcelFileDescriptor.createPipe();
    android.os.ParcelFileDescriptor readSide = pipe[0];
    android.os.ParcelFileDescriptor writeSide = pipe[1];
    org.openintents.smime.ParcelFileDescriptorUtil.TransferThread t = new org.openintents.smime.ParcelFileDescriptorUtil.TransferThread(inputStream, new android.os.ParcelFileDescriptor.AutoCloseOutputStream(writeSide));
    t.start();
    return readSide;
}