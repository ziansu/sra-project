public void updateCommissionedEmployeeMonthlySalarySaleRate(int id_employee, float monthly_salary, float sale_rate) {
    java.util.List<it.screwdrivers.payroll.pojo.employee.CommissionedEmployee> commissioned_list = e_dao.findAllCommissioned();
    for (it.screwdrivers.payroll.pojo.employee.CommissionedEmployee c : commissioned_list) {
        if ((c.getId()) == id_employee) {
            c.setMonthly_salary(monthly_salary);
            c.setSale_rate(sale_rate);
            e_dao.update(c);
            break;
        }
    }
}