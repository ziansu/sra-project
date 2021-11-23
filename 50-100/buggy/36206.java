private net.nitroshare.android.bundle.Bundle createBundle(java.lang.String[] urls, java.lang.String[] filenames) {
    net.nitroshare.android.bundle.Bundle bundle = new net.nitroshare.android.bundle.Bundle();
    for (java.lang.String url : urls) {
    }
    for (java.lang.String filename : filenames) {
        bundle.add(new net.nitroshare.android.bundle.FileItem(filename));
    }
    return bundle;
}