@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    java.lang.String station = s.split(":::")[0];
    java.lang.String music = s.split(":::")[1];
    in.mayanknagwanshi.radiodrive.fragment.SearchFragment.Adapter adapter = new in.mayanknagwanshi.radiodrive.fragment.SearchFragment.Adapter(getChildFragmentManager());
    adapter.addFragment(new in.mayanknagwanshi.radiodrive.fragment.SearchResultFragment(), music);
    adapter.addFragment(new in.mayanknagwanshi.radiodrive.fragment.SearchResultFragment(), station);
    viewPager.setAdapter(adapter);
    hideProgressbar();
    tabLayout.setupWithViewPager(viewPager);
}