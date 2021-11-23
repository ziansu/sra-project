private void addCount(com.cxense.rostering.schedule.Shift shift, java.util.Map<com.cxense.rostering.employee.Employee, java.lang.Integer> shiftCount) {
    for (com.cxense.rostering.employee.Employee employee : shift.getEmployees()) {
        int count = shiftCount.get(employee);
        shiftCount.put(employee, (count + 1));
    }
}