protected void notifyObserversOfAdSizeChange(final int adIdx) {
    android.content.Context context = mContext.get();
    if (context != null) {
        new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                for (com.clockbyte.admobadapter.AdmobFetcherBase.AdmobListener listener : mAdNativeListeners)
                    if (adIdx < 0)
                        listener.onAdChanged();
                    else
                        listener.onAdChanged(adIdx);
                    
                
            }
        });
    }
}