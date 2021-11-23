public static void clearDiskCache(final android.content.Context context) {
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            com.bumptech.glide.Glide.get(context).clearDiskCache();
        }
    }.start();
}