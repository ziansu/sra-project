@java.lang.Override
protected void onResume() {
    super.onResume();
    java.lang.System.out.println("onresume Running");
    contactsListView.update();
    callLogListView.update();
}