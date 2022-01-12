public static boolean isCitizensSupported() {
    if (((one.lindegaard.MobHunting.compatability.CitizensCompat.supported) && ((one.lindegaard.MobHunting.compatability.CitizensCompat.citizensAPI) != null)) && (net.citizensnpcs.api.CitizensAPI.hasImplementation()))
        return one.lindegaard.MobHunting.compatability.CitizensCompat.supported;
    else
        return false;
    
}