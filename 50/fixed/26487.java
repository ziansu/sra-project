public void waitEndOfScripting(zildo.monde.quest.actions.ScriptAction action) {
    while (true) {
        renderFrames(1);
        if (!(EngineZildo.scriptManagement.isScripting())) {
            break;
        }
        if (action != null) {
            action.launchAction(clientState);
        }
    } 
}