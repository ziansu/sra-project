public <T> void attachDataSource(@android.support.annotation.NonNull
java.util.List<T> dataset) {
    adapter = new org.angmarch.views.NiceSpinnerAdapter(getContext(), dataset, textColor, backgroundSelector);
    setAdapterInternal(adapter);
}