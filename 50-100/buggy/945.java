public void add(float amount) {
    if (((getCurrentSum().getMonth()) != (java.util.Calendar.MONTH)) && ((getCurrentSum().getYear()) != (java.util.Calendar.YEAR))) {
        com.example.spendee.MonthlySum currentSum = new com.example.spendee.MonthlySum();
        currentSum.add(amount);
        purchases.push(currentSum);
    }else {
        getCurrentSum().add(amount);
    }
}