@java.lang.Override
public void withdraw(float x) throws com.luxoft.bankapp.exception.OverDraftLimitExceededException {
    if (x > (getBalance())) {
        overdraft = (overdraft) - (x - (getBalance()));
        if ((overdraft) < 0) {
            throw new com.luxoft.bankapp.exception.OverDraftLimitExceededException(x, this);
        }
    }else
        if (((getBalance()) + (getOverdraft())) >= x) {
            float newBalance = (getBalance()) - x;
            setBalance(newBalance);
        }
    
}