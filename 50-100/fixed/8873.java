public static void removeEmployee(int id) {
    StaffManager.Company.employeeList.remove((id - 1));
    for (int i = id - 1; i < (StaffManager.Company.employeeList.size()); i++) {
        StaffManager.Company.employeeList.get(i).setId((i + 1));
    }
}