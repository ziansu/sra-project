@java.lang.Override
protected void onPostExecute(java.lang.String msg) {
    getFragmentManager().beginTransaction().replace(R.id.MainFragment, new gruppe3.convoy.GMapsFragment()).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
}