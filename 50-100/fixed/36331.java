public void setAdapter(android.widget.ExpandableListAdapter adapter) {
    super.setAdapter(adapter);
    if (adapter instanceof com.idunnololz.widgets.AnimatedExpandableListView.AnimatedExpandableListAdapter) {
        this.adapter = ((com.idunnololz.widgets.AnimatedExpandableListView.AnimatedExpandableListAdapter) (adapter));
        this.adapter.setParent(this);
    }else {
        throw new java.lang.ClassCastException((adapter + " must implement AnimatedExpandableListAdapter"));
    }
}