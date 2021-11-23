@java.lang.Override
public void addEmc(double amount) {
    emc += amount;
    if ((emc) > (maxAmount)) {
        emc = maxAmount;
    }else
        if ((emc) < 0) {
            emc = 0;
        }
    
}