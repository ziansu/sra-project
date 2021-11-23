private void transferOperation(java.lang.String fromAccNum, java.lang.String toAccNum, java.lang.String amount) {
    withdrawOperation(fromAccNum, amount);
    depositOperation(toAccNum, amount);
}