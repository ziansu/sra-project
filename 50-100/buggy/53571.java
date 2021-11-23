public static android.os.ParcelFileDescriptor pipeFrom(java.io.InputStream inputStream, org.openintents.smime.ParcelFileDescriptorUtil.IThreadListener listener) throws java.io.IOException {
    android.os.ParcelFileDescriptor[] pipe = android.os.ParcelFileDescriptor.createPipe();
    android.os.ParcelFileDescriptor readSide = pipe[0];
    android.os.ParcelFileDescriptor writeSide = pipe[1];
    new org.openintents.smime.ParcelFileDescriptorUtil.TransferThread(inputStream, new android.os.ParcelFileDescriptor.AutoCloseOutputStream(writeSide), listener).start();
    return readSide;
}