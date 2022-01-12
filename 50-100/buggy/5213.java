@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.UUID crimeId = ((java.util.UUID) (getArguments().getSerializable(com.bignerdranch.android.criminalintent.CrimeFragment.ARG_CRIME_ID)));
    mCrime = com.bignerdranch.android.criminalintent.CrimeLab.get(getActivity()).getCrime(crimeId);
    mPhotoFiles = com.bignerdranch.android.criminalintent.CrimeLab.get(getActivity()).getPhotoFiles(mCrime);
    for (int i = 0; i < (mPhotoFiles.size()); i++) {
        java.lang.System.out.println(mPhotoFiles.get(i));
    }
}