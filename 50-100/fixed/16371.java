private void createParameterList() {
    org.entirej.framework.core.EJParameterList list = new org.entirej.framework.core.EJParameterList();
    for (org.entirej.framework.core.data.controllers.EJInternalFormParameter parameter : _dataForm.getProperties().getAllFormParameters()) {
        org.entirej.framework.core.data.controllers.EJFormParameter listParameter = new org.entirej.framework.core.data.controllers.EJFormParameter(parameter.getName(), parameter.getDataType());
        listParameter.setValue(parameter.getValue());
        list.addParameter(listParameter);
    }
    _parameterList = list;
}