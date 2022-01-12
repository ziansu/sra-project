@java.lang.Override
public android.view.View getContentLayout(android.view.View view) {
    this.draftListView = ((android.widget.ListView) (view.findViewById(R.id.draft_list)));
    this.sendAllButton = ((android.widget.Button) (view.findViewById(R.id.send_all_button)));
    initializeDraftList(this.draftManager, this.draftListView);
    initializeSendAllButton(this.sendAllButton);
    return view;
}