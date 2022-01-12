@org.junit.Test
public void shouldTrackDeposits() {
    account.deposit(124);
    account.deposit(212);
    account.deposit(2);
    account.deposit(1663);
    validatePrint("Date       | Amount | Balance", ((today()) + " | 1663   | 2001"), ((today()) + " | 2      | 338"), ((today()) + " | 212    | 336"), ((today()) + " | 124    | 124"));
}