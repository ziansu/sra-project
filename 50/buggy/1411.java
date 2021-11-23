@java.lang.Override
public void rowSelected(mobileoak.volleyballtracker.model.Player player) {
    android.util.Log.d("tag", ("Called with player " + (player.getName())));
    mPlayerName.setText(player.getName());
}