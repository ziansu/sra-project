private void updateSubtitle() {
    com.csci448.npohl.criminalintent.CrimeLab crimeLab = com.csci448.npohl.criminalintent.CrimeLab.get(getActivity());
    int crimeCount = crimeLab.getCrimes().size();
    java.lang.String subtitle = getString(R.string.subtitle_format, crimeCount);
    if (!(mSubtitleVisible)) {
        subtitle = null;
    }
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.getSupportActionBar().setSubtitle(subtitle);
}