public void splitTimeForPeriod() {
    java.time.LocalTime tmp = bank.Bank.START;
    while (tmp.isBefore(bank.Bank.FINISH)) {
        if (tmp.plusMinutes(periodLength).isAfter(bank.Bank.FINISH)) {
            periods.add(new bank.Period(tmp, bank.Bank.FINISH));
            break;
        }else {
            periods.add(new bank.Period(tmp, tmp.plusMinutes(periodLength)));
            tmp = tmp.plusMinutes(periodLength);
        }
    } 
}