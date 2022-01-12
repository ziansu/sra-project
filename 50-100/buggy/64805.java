public me.beastman3226.bc.business.Business withdraw(double amount) throws me.beastman3226.bc.errors.InsufficientFundsException {
    if (amount > (this.worth)) {
        throw new me.beastman3226.bc.errors.InsufficientFundsException(("Not enough funds. Missing " + (amount - (worth))));
    }else {
        this.worth = -amount;
        me.beastman3226.bc.BusinessCore.log(java.util.logging.Level.INFO, ((((("Withdrawing " + amount) + " from ") + (this.worth)) + " in business ") + (this.getName())));
    }
    return this;
}