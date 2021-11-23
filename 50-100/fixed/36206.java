private net.nitroshare.android.bundle.Bundle createBundle(java.lang.String[] urls, java.lang.String[] filenames) {
    net.nitroshare.android.bundle.Bundle bundle = new net.nitroshare.android.bundle.Bundle();
    if (urls != null) {
        for (java.lang.String url : urls) {
        }
    }
    if (filenames != null) {
        for (java.lang.String filename : filenames) {
            bundle.add(new net.nitroshare.android.bundle.FileItem(new java.io.File(filename)));
        }
    }
    return bundle;
}