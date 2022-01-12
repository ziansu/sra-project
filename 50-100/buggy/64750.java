@java.lang.Override
public void onCreate(android.os.Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
    mPetfinder = org.parceler.Parcels.unwrap(getArguments().getParcelable(Constants.EXTRA_KEY_PETFINDERS));
    mPosition = getArguments().getInt(Constants.EXTRA_KEY_POSITION);
    mPetfinder = mPetfinders.get(mPosition);
    mSource = getArguments().getString(Constants.KEY_SOURCE);
    setHasOptionsMenu(true);
}