public java.util.List<pt.ist.fenixedu.contracts.domain.Employee> getAllWorkingEmployees() {
    java.util.Set<pt.ist.fenixedu.contracts.domain.Employee> employees = new java.util.HashSet<pt.ist.fenixedu.contracts.domain.Employee>();
    for (pt.ist.fenixedu.contracts.domain.organizationalStructure.Contract contract : pt.ist.fenixedu.contracts.domain.organizationalStructure.EmployeeContract.getWorkingContracts(this)) {
        employees.add(contract.getEmployee());
    }
    for (org.fenixedu.academic.domain.organizationalStructure.Unit subUnit : getSubUnits()) {
        employees.addAll(((pt.ist.fenixedu.contracts.domain.organizationalStructure.ResearchUnit) (subUnit)).getAllWorkingEmployees());
    }
    return new java.util.ArrayList<pt.ist.fenixedu.contracts.domain.Employee>(employees);
}