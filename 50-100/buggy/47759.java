public static void setActiveState(java.lang.String key) {
    if (com.mpu.spinv.engine.StateMachine.states.containsKey(key)) {
        if (((com.mpu.spinv.engine.StateMachine.activeState) != null) && (!(com.mpu.spinv.engine.StateMachine.activeState.isSaveResources()))) {
            com.mpu.spinv.engine.StateMachine.activeState.killResources();
        }
        com.mpu.spinv.engine.StateMachine.actStateId = key;
        com.mpu.spinv.engine.StateMachine.activeState = com.mpu.spinv.engine.StateMachine.states.get(key);
        if ((com.mpu.spinv.engine.StateMachine.activeState.getSpriteSheetUrl()) != null)
            com.mpu.spinv.engine.StateMachine.spriteSheet.setSpriteSheetImage(com.mpu.spinv.engine.StateMachine.class.getResource(com.mpu.spinv.engine.StateMachine.activeState.getSpriteSheetUrl()));
        
        com.mpu.spinv.engine.StateMachine.activeState.loadResources();
    }
}