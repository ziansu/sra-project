public void refresh() {
    goals.clear();
    getGoals(db);
    ((transcend.rockeeper.activities.GoalsFragment.GoalListAdapter) (listview.getAdapter())).notifyDataSetChanged();
}