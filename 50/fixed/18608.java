@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    directionItem = menu.findItem(R.id.action_direction);
    directionItem.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
    directionItem.setVisible(true);
}