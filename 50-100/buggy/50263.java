public static boolean isValidOption(java.lang.Integer integer) {
    if (integer == null)
        return false;
    
    for (org.jbei.ice.lib.shared.BioSafetyOption option : org.jbei.ice.lib.shared.BioSafetyOption.values()) {
        if ((integer.intValue()) == (org.jbei.ice.lib.shared.BioSafetyOption.intValue(option.toString()).intValue()))
            return true;
        
    }
    return false;
}