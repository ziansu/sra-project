final boolean withdrawMoney(int amount) {
    if ((walkToBank()) && (ctx.bank.open())) {
        if (((invMoney()) == 0) && ((ctx.inventory.select().count()) == 28))
            ctx.bank.deposit(jaccob.blastfurnace.BlastFurnace.GOLD_ORE_ID, 1);
        
        if (ctx.bank.withdraw(jaccob.blastfurnace.BlastFurnace.GOLD_ID, amount))
            return ctx.bank.close();
        
    }
    return false;
}