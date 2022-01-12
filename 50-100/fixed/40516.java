private Id.Program getProgramId(co.cask.cdap.proto.Id.Namespace namespace, java.lang.String adapterName) throws co.cask.cdap.common.exception.NotFoundException {
    co.cask.cdap.templates.AdapterSpecification adapterSpec = getAdapter(namespace, adapterName);
    co.cask.cdap.proto.ProgramType programType = appTemplateInfos.get().get(adapterSpec.getTemplate()).getProgramType();
    co.cask.cdap.proto.Id.Program program;
    if (programType == (co.cask.cdap.proto.ProgramType.WORKFLOW)) {
        program = getWorkflowId(namespace, adapterSpec);
    }else {
        program = getWorkerId(namespace, adapterSpec);
    }
    return program;
}