public static void startTrainingCognitiv(java.lang.Integer cognitivAction, com.sun.jna.Pointer eEvent) {
    UpgradedEdk.INSTANCE.IEE_MentalCommandSetTrainingAction(0, cognitivAction);
    UpgradedEdk.INSTANCE.IEE_MentalCommandSetTrainingControl(0, UpgradedEdk.IEE_MentalCommandTrainingControl_t.MC_START.getType());
}