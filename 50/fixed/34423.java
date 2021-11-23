public void insert(java.lang.String day, java.lang.Integer shift, java.lang.Integer employee, java.lang.Integer amount) {
    addDay(day);
    addShift(day, shift);
    addEmployee(day, shift, employee, amount);
}