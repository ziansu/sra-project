private void toggleLaridaar() {
    laridaarMode = !(laridaarMode);
    laridaarSetup();
    shabadView.getAdapter().notifyDataSetChanged();
}