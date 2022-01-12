public void updateContractorEmployeeHourlyRate(int id_employee, float hourly_rate) {
    java.util.List<it.screwdrivers.payroll.pojo.employee.ContractorEmployee> contractor_list = e_dao.findAllContractor();
    for (it.screwdrivers.payroll.pojo.employee.ContractorEmployee c : contractor_list) {
        if ((c.getId()) == id_employee) {
            c.setHourly_rate(hourly_rate);
            e_dao.update(c);
            break;
        }
    }
}