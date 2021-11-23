public void handleObjects(java.lang.String currentSuggestion, de.prob2.ui.consoles.groovy.codecompletion.TriggerAction action, javax.script.ScriptEngine engine) {
    if ((action == (TriggerAction.TRIGGER)) && (suggestions.isEmpty())) {
        currentSuggestions.clear();
        fillObjects(engine.getBindings(javax.script.ScriptContext.ENGINE_SCOPE));
        fillObjects(engine.getBindings(javax.script.ScriptContext.GLOBAL_SCOPE));
    }
    if (action == (TriggerAction.TRIGGER)) {
        refresh(currentSuggestion);
    }
}