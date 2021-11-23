public static org.jbei.ice.lib.dto.entry.PlantType fromString(java.lang.String value) {
    for (org.jbei.ice.lib.dto.entry.PlantType option : org.jbei.ice.lib.dto.entry.PlantType.values()) {
        if ((value.equalsIgnoreCase(option.toString())) || (value.equalsIgnoreCase(option.name())))
            return option;
        
    }
    return null;
}