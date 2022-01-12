@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    if ((getArguments()) != null) {
        mSong = org.parceler.Parcels.unwrap(getArguments().getParcelable(com.rpham64.android.calmify.ui.CalmifyFragment.Extras.song));
        mImage = org.parceler.Parcels.unwrap(getArguments().getParcelable(com.rpham64.android.calmify.ui.CalmifyFragment.Extras.image));
    }
}