@java.lang.Override
public sunny.com.criminalintent.CrimeListFragment.CrimeHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(getActivity());
    android.view.View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
    return new sunny.com.criminalintent.CrimeListFragment.CrimeHolder(view);
}