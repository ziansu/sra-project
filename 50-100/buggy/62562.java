@java.lang.Override
public void onEnable() {
    this.profiles = new com.rezzedup.parrot.profiles.ProfileManager();
    this.processor = new com.rezzedup.parrot.SpamProcessor(new com.rezzedup.parrot.MessageModifier());
    profiles.registerProfileMapper(this, new com.rezzedup.parrot.profiles.PlayerProfile.Mapper());
    getServer().getPluginManager().registerEvents(this, this);
    new com.rezzedup.parrot.handlers.MessageSimilarityHandler(this);
}