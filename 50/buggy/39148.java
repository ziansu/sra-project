public static boolean isBluPlugActive() {
    if (com.grarak.kerneladiutor.utils.kernel.CPUHotplug.hasBluPlug()) {
        if (com.grarak.kerneladiutor.utils.kernel.CPUHotplug.hasBluPlugEnable()) {
            return com.grarak.kerneladiutor.utils.Utils.readFile(com.grarak.kerneladiutor.utils.kernel.HOTPLUG_BLU_PLUG_ENABLE).equals("1");
        }else
            return true;
        
    }
    return false;
}