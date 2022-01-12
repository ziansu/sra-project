public static java.util.Set<java.lang.Class<?>> getIHMCCoreRosMessagePacketAnnotatedClasses() {
    if ((us.ihmc.utilities.ros.msgToPacket.converter.GenericROSTranslationTools.ihmcCoreAnnotatedPacket) == null) {
        us.ihmc.utilities.ros.msgToPacket.converter.GenericROSTranslationTools.ihmcCoreAnnotatedPacket = new java.util.HashSet<>();
        for (java.lang.Class<?> aClass : us.ihmc.utilities.ros.msgToPacket.converter.GenericROSTranslationTools.getAllRosMessagePacketAnnotatedClasses()) {
            us.ihmc.communication.ros.generators.RosMessagePacket annotation = aClass.getAnnotation(us.ihmc.communication.ros.generators.RosMessagePacket.class);
            if (annotation.rosPackage().equals(RosMessagePacket.CORE_IHMC_PACKAGE)) {
                us.ihmc.utilities.ros.msgToPacket.converter.GenericROSTranslationTools.ihmcCoreAnnotatedPacket.add(aClass);
            }
        }
    }
    return us.ihmc.utilities.ros.msgToPacket.converter.GenericROSTranslationTools.ihmcCoreAnnotatedPacket;
}