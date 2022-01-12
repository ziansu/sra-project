@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    android.util.Log.i(com.rpham64.android.calmify.ui.CalmifyFragment.TAG, "onCreate");
    if ((getArguments()) != null) {
        mSong = org.parceler.Parcels.unwrap(getArguments().getParcelable(com.rpham64.android.calmify.ui.CalmifyFragment.Extras.song));
        mImage = org.parceler.Parcels.unwrap(getArguments().getParcelable(com.rpham64.android.calmify.ui.CalmifyFragment.Extras.image));
    }
}