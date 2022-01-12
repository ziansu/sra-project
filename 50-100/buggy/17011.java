@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    fr.kayrnt.tindplayer.client.TinderAPI.getInstance().account = ((fr.kayrnt.tindplayer.model.FacebookAccount) (view.getTag()));
    fr.kayrnt.tindplayer.client.TinderAPI.getInstance().account.setCurrentAccount();
}