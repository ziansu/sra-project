public java.lang.String checkId(int id) {
    java.lang.String ret = null;
    switch (id) {
        case org.activiti.bpmn.converter.UserCheck.MANAGER_ID :
            ret = manager;
            break;
        case org.activiti.bpmn.converter.UserCheck.EMPLOYEE_ID :
            ret = employee;
            break;
    }
    return ret;
}