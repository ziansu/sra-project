@java.lang.Override
public void validate(pcm.model.Script script, pcm.model.Action action, java.util.List<pcm.model.ValidationIssue> validationErrors) throws pcm.model.ScriptParsingException {
    try {
        pcm.model.Script loadSbd = script.load(scriptName);
        loadSbd.actions.validate(script, action, new pcm.model.ActionRange(start, end), validationErrors);
    } catch (pcm.model.ScriptParsingException e) {
        throw e;
    } catch (pcm.model.ValidationIssue e) {
        validationErrors.add(e);
    } catch (java.io.IOException e) {
        validationErrors.add(new pcm.model.ValidationIssue(action, e, script));
    }
}