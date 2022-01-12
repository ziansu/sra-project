@java.lang.Override
public void execute(gr.aueb.dmst.istlab.unixtools.actions.ActionExecutionCallback<gr.aueb.dmst.istlab.unixtools.actions.VoidActionResult> callback) throws gr.aueb.dmst.istlab.unixtools.dal.DataAccessException {
    gr.aueb.dmst.istlab.unixtools.actions.VoidActionResult result = new gr.aueb.dmst.istlab.unixtools.actions.VoidActionResult();
    try {
        gr.aueb.dmst.istlab.unixtools.core.model.CommandPrototypeModel deserializedModel = this.commandPrototypeRepository.getModel();
        this.model.setCommands(deserializedModel.getCommands());
    } catch (gr.aueb.dmst.istlab.unixtools.dal.DataAccessException ex) {
        result = new gr.aueb.dmst.istlab.unixtools.actions.VoidActionResult(ex);
        throw new gr.aueb.dmst.istlab.unixtools.dal.DataAccessException(ex);
    }
    callback.onCommandExecuted(result);
}