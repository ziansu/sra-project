@java.lang.Override
public boolean removeAdvanceById(int advanceId, int payrollId, double removedAmount, double amountToBeReceive, double amountReceivable, java.lang.String remarks) {
    return payrollDAO.removeAdvancesById(advanceId, payrollId, removedAmount, amountToBeReceive, amountReceivable, remarks);
}