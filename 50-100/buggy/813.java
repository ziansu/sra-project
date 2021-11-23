private void convertFromSDK(final org.eyeseetea.malariacare.data.sync.importer.Callback callback, org.eyeseetea.malariacare.domain.usecase.pull.ConversionFilter conversionFilter) {
    android.util.Log.d(org.eyeseetea.malariacare.data.sync.importer.PullController.TAG, "Converting SDK into APP data");
    try {
        if (conversionFilter.metadataConversion()) {
            convertMetaData(callback);
        }
        if (conversionFilter.dataConversion()) {
            convertData(callback);
        }else {
            callback.onComplete();
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        callback.onError(new org.eyeseetea.malariacare.domain.exception.PullConversionException());
    }
}