private agency.tango.skald.core.Player getForProvider(agency.tango.skald.core.Provider provider) throws agency.tango.skald.core.AuthException {
    if (playerMap.containsKey(provider.getProviderName())) {
        return playerMap.get(provider.getProviderName());
    }else {
        agency.tango.skald.core.Player player = provider.getPlayerFactory().getPlayer();
        playerMap.put(provider.getProviderName(), player);
        addPlayerReadyListener(player, provider);
        return player;
    }
}