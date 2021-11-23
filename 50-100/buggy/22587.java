@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mGridView = ((android.widget.GridView) (view.findViewById(R.id.gridview)));
    mTextViewEmpty = ((android.widget.TextView) (view.findViewById(android.R.id.empty)));
    mGroupsGridAdapter = new com.studios.lucian.students.adapter.GroupsGridAdapter(getContext(), mGroups);
    mGridView.setAdapter(mGroupsGridAdapter);
    mGridView.setEmptyView(mTextViewEmpty);
    mGridView.setOnItemClickListener(this);
}