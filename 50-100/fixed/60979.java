@java.lang.Override
public eu.supersede.gr.model.HProcess getProcess() {
    eu.supersede.gr.model.HProcess process = eu.supersede.dm.DMGame.get().getJpa().processes.findOne(processId);
    if (process == null) {
        throw new eu.supersede.fe.exception.NotFoundException((("Process with id " + (processId)) + " does not exist"));
    }
    return process;
}