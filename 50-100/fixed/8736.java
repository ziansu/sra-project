@java.lang.Override
public void setActive() {
    isActive = true;
    saveService.saveDataValue(SaveEnum.CONTEXT, context);
    if (((type) == (com.majalis.scenes.EndScene.Type.ENCOUNTER_OVER)) || ((type) == (com.majalis.scenes.EndScene.Type.GAME_OVER))) {
        saveService.saveDataValue(SaveEnum.RETURN_CONTEXT, null);
    }
    saveService.saveDataValue(SaveEnum.SCENE_CODE, (-1));
}