public boolean isReady() {
    com.raizlabs.android.dbflow.data.Blob form = tracingFormDao.getTracingForm().getForm();
    return form != null;
}