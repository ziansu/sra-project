private java.lang.String getConvStrategyFormatted() {
    if (((edu.cmu.inmind.multiuser.socialreasoner.control.SocialReasonerController.conversationalStrategies) == null) || ((edu.cmu.inmind.multiuser.socialreasoner.control.SocialReasonerController.conversationalStrategies[0]) == null)) {
        return edu.cmu.inmind.multiuser.socialreasoner.model.Constants.NONE;
    }
    return edu.cmu.inmind.multiuser.socialreasoner.control.SocialReasonerController.conversationalStrategies[0].equals(Constants.ACK_SYSTEM_CS) ? ((edu.cmu.inmind.multiuser.socialreasoner.model.Constants.ACK_SYSTEM_CS) + " -> ") + (edu.cmu.inmind.multiuser.socialreasoner.control.SocialReasonerController.conversationalStrategies[1]) : edu.cmu.inmind.multiuser.socialreasoner.control.SocialReasonerController.conversationalStrategies[0];
}