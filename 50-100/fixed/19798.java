@org.junit.Test
public void shouldNotHaveEnoughFundsInTheATM() {
    java.lang.String accNumber = "00123";
    java.math.BigDecimal amount = java.math.BigDecimal.TEN;
    when(counterService.count(atmService.getAvailableNotes(), amount)).thenReturn(new com.demo.accountservice.util.Count(1, java.util.Collections.emptyList()));
    com.demo.accountservice.util.Withdrawal withdrawal = atmService.withdraw(accNumber, amount);
    assertTrue(withdrawal.getCode().equals(ErrorCode.INSUFFICIENT_FUNDS_IN_ATM));
}