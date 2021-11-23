public void waitEndOfScripting(zildo.monde.quest.actions.ScriptAction action) {
    while (EngineZildo.scriptManagement.isScripting()) {
        renderFrames(1);
        if (action != null) {
            action.launchAction(clientState);
        }
    } 
}