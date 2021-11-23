private void loadWhiskeys() {
    java.util.List<edu.wpi.mis270xteam1.whiskybarrl.Whiskey> whiskeys = db.getAllWhiskeys();
    edu.wpi.mis270xteam1.whiskybarrl.Whiskey[] whiskeyArray = whiskeys.toArray(new edu.wpi.mis270xteam1.whiskybarrl.Whiskey[whiskeys.size()]);
    android.widget.ArrayAdapter<edu.wpi.mis270xteam1.whiskybarrl.Whiskey> whiskeyListAdapter = new edu.wpi.mis270xteam1.whiskybarrl.WhiskeyListAdapter(getActivity(), whiskeyArray);
    whiskeyListView.setAdapter(whiskeyListAdapter);
}