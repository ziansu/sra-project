public void closeDocument(com.shockwave.pdfium.PdfDocument doc) {
    synchronized(com.shockwave.pdfium.PdfiumCore.lock) {
        for (java.lang.Integer index : doc.mNativePagesPtr.keySet()) {
            nativeClosePage(doc.mNativePagesPtr.get(index));
        }
        doc.mNativePagesPtr.clear();
        nativeCloseDocument(doc.mNativeDocPtr);
        if ((doc.parcelFileDescriptor) != null) {
            try {
                doc.parcelFileDescriptor.close();
            } catch (java.io.IOException e) {
            }
            doc.parcelFileDescriptor = null;
        }
    }
}