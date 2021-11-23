@java.lang.Override
public double deposit(double amount) {
    if ((getBalance()) == 0)
        return 0;
    
    double deposited = super.deposit(amount);
    double finalDeposit = against.deposit(deposited);
    double difference = finalDeposit - deposited;
    if (difference != 0)
        super.withdraw(difference);
    
    return finalDeposit;
}