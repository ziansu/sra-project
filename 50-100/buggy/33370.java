public void updateSalariedEmployeeMonthlySalary(int id_employee, float monthly_salary) {
    java.util.List<it.screwdrivers.payroll.pojo.employee.SalariedEmployee> salaried_list = e_dao.findAllSalaried();
    for (it.screwdrivers.payroll.pojo.employee.SalariedEmployee s : salaried_list) {
        if ((s.getId()) == id_employee) {
            s.setMonthly_salary(monthly_salary);
            e_dao.update(s);
        }
    }
}