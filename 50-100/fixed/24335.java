@java.lang.Override
public android.view.View getContentLayout(android.view.View view) {
    this.sendAllButton = ((android.widget.Button) (view.findViewById(R.id.send_all_button)));
    this.draftListView = ((android.widget.ListView) (view.findViewById(R.id.draft_list)));
    initializeDraftList(this.draftManager);
    initializeSendAllButton(this.sendAllButton);
    return view;
}