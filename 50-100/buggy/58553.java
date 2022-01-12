public void updateUI() {
    fragments.EmployerJobListFragment.listAdapter = new adapters.EmployerJobAdapter(getActivity().getApplicationContext(), this, app.employerJobList);
    listView.setAdapter(fragments.EmployerJobListFragment.listAdapter);
    listView.setOnItemClickListener(this);
    listView.setEmptyView(getActivity().findViewById(R.id.empty_list_view));
    fragments.EmployerJobListFragment.listAdapter.notifyDataSetChanged();
}