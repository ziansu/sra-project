public static android.os.ParcelFileDescriptor pipeTo(java.io.OutputStream outputStream, org.openintents.smime.ParcelFileDescriptorUtil.IThreadListener listener) throws java.io.IOException {
    android.os.ParcelFileDescriptor[] pipe = android.os.ParcelFileDescriptor.createPipe();
    android.os.ParcelFileDescriptor readSide = pipe[0];
    android.os.ParcelFileDescriptor writeSide = pipe[1];
    new org.openintents.smime.ParcelFileDescriptorUtil.TransferThread(new android.os.ParcelFileDescriptor.AutoCloseInputStream(readSide), outputStream, listener).start();
    return writeSide;
}