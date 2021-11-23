public int getTotalAmountSavings() {
    java.lang.Long totalAmountSavings = 0L;
    for (nl.aalten.javalearning.Person person : customers) {
        totalAmountSavings = totalAmountSavings + (person.getSaldo());
    }
    return totalAmountSavings.intValue();
}