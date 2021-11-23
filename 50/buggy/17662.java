@org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onProjectsListEvent(java.util.Map<java.lang.Integer, bak.mateusz.sourcemeter.model.Project> event) {
    if (getArguments().containsKey(bak.mateusz.sourcemeter.ProjectDetailFragment.ARG_ITEM_ID))
        this.mItem = event.get(getArguments().getInt(bak.mateusz.sourcemeter.ProjectDetailFragment.ARG_ITEM_ID));
    
    sectionAdapter.notifyDataSetChanged();
}