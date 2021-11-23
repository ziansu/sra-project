private void setUpComponents() {
    projectAdapter = new fredkobo.co.za.codeproject.presentation.home.ProjectAdapter(projectList, homeView);
    projectRecyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.recycler_view_projects)));
    projectRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    projectRecyclerView.setAdapter(projectAdapter);
}