private void smallBlind() {
    java.math.BigDecimal amount = pokerTable.getDefaultPot().divide(new java.math.BigDecimal(2));
    myDebt = myDebt.add(amount);
    alreadInPot = alreadInPot.add(amount);
    sendPlayerCommand(HoldemPlayerCommandType.BLIND, amount, null);
}