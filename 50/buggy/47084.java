public double getDailyWages() {
    double total = 0.0;
    for (project.Employee emp : this.employees) {
        total += emp.getWage();
    }
    return (total * (this.closingHour)) - (this.openingHour);
}