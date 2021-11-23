@java.lang.Override
public void load(net.citizensnpcs.api.util.DataKey key) throws net.citizensnpcs.api.exception.NPCLoadException {
    if ((provider) == null) {
        providerName = key.getString("provider", "linear");
        provider = net.citizensnpcs.trait.waypoint.Waypoints.providers.getInstance(providerName);
        if ((provider) == null)
            return ;
        
    }
    provider.load(key.getRelative(providerName));
    npc.getAI().registerNavigationCallback(provider.getCallback());
}