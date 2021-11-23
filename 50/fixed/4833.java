@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((badge) != null) {
        android.os.Bundle bundle = saveState();
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }
    return super.onSaveInstanceState();
}