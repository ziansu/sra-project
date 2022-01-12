public void clearGlideCache() {
    try {
        if ((android.os.Looper.myLooper()) == (android.os.Looper.getMainLooper())) {
            new java.lang.Thread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    com.bumptech.glide.Glide.get(com.idogfooding.bone.BaseApplication._context).clearDiskCache();
                }
            });
        }else {
            com.bumptech.glide.Glide.get(com.idogfooding.bone.BaseApplication._context).clearDiskCache();
        }
        com.bumptech.glide.Glide.get(this).clearMemory();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}