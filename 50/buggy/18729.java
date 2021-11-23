@java.lang.Override
public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
    StellarAPI.logger.info("Initializing Math class...");
    stellarapi.api.lib.math.Spmath.Initialize();
    StellarAPI.logger.info(("[StellarAPI]: " + "Math Class Initialized!"));
}