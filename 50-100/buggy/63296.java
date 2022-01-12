public static void startTrainingCognitiv(EmoState.EE_CognitivAction_t cognitivAction) {
    if ((API_Main.activeCognitivMap.containsKey(cognitivAction)) && ((API_Main.activeCognitivMap.get(cognitivAction)) == true)) {
        Edk.INSTANCE.EE_CognitivSetTrainingAction(0, cognitivAction.ToInt());
        Edk.INSTANCE.EE_CognitivSetTrainingControl(0, Edk.EE_CognitivTrainingControl_t.COG_START.getType());
    }
}