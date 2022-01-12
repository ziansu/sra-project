@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    org.give2peer.give2peer.entity.Server newServer = new org.give2peer.give2peer.entity.Server().loadDummy();
    newServer.save();
    refreshView(true);
    return true;
}