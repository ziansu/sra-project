@java.lang.Override
public void onEnable() {
    java.lang.Boolean pluginenabled = true;
    java.lang.System.out.println("Downer started...");
    getServer().getPluginManager().registerEvents(new co.bitquest.downer.EventListener(), this);
}