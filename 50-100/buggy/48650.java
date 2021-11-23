@java.lang.Override
protected void setupListViewListener(android.widget.ListView lvItems) {
    lvItems.setAdapter(new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, com.nineworldsdeep.gauntlet.hive.HiveLobeType.values()));
    lvItems.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            com.nineworldsdeep.gauntlet.core.NavigateActivityCommand cmd = cmds.get(position);
            cmd.navigate();
        }
    });
}