public static void loadLibrary(java.lang.String libraryPath) {
    if (!(org.quenlen.magic.MagicImage.isLibraryLoadSuccess())) {
        try {
            java.lang.System.load(libraryPath);
            org.quenlen.magic.MagicImage.STATE = org.quenlen.magic.MagicImage.MASK_SUCCESS;
        } catch (java.lang.Exception ex) {
            android.util.Log.e(org.quenlen.magic.MagicImage.TAG, "Manual load library error");
            org.quenlen.magic.MagicImage.STATE = org.quenlen.magic.MagicImage.MASK_FAILURE;
        }
    }
}