@java.lang.Override
protected void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof com.quicklib.android.core.bo.CustomViewState) {
        com.quicklib.android.core.bo.CustomViewState viewState = ((com.quicklib.android.core.bo.CustomViewState) (state));
        super.onRestoreInstanceState(viewState.getSuperState());
        onActivityCreated(viewState.getInstanceState());
    }else {
        super.onRestoreInstanceState(state);
        onActivityCreated(new android.os.Bundle());
    }
}