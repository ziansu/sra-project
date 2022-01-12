@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.d(com.osu.cse5236.oddjobs.JobListFragment.TAG, "onOptionsItemSelected() called");
    switch (item.getItemId()) {
        case R.id.new_job :
            com.osu.cse5236.oddjobs.Job job = new com.osu.cse5236.oddjobs.Job();
            android.content.Intent intent = com.osu.cse5236.oddjobs.NewJobActivity.newIntent(getActivity(), job.getId());
            startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}