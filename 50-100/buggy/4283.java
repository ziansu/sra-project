public void runPersoAction(zildo.monde.sprites.persos.Perso perso, java.lang.String name, zildo.fwk.script.context.IEvaluationContext p_callerContext) {
    zildo.server.state.ScriptCall call = new zildo.server.state.ScriptCall(name, new zildo.fwk.script.context.SpriteEntityContext(perso));
    zildo.fwk.script.xml.element.ContextualActionElement action = adventure.getPersoActionNamed(call.actionName);
    if (action != null) {
        zildo.fwk.script.xml.element.action.runtime.RuntimeScene scene = new zildo.fwk.script.xml.element.action.runtime.RuntimeScene(action.actions, null, false, call);
        scriptExecutor.execute(scene, true, false, p_callerContext, null);
        perso.setAttente(action.duration);
    }
}