@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.UUID crimeId = ((java.util.UUID) (getArguments().getSerializable(com.zyq.myapplication.CrimeFragment.EXTRA_CRIME_ID)));
    crime = com.zyq.myapplication.CrimeLab.getCrimeLab(getActivity()).getCrime(crimeId);
    setHasOptionsMenu(true);
}