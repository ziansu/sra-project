@java.lang.Override
public int calculateTotalLateFees() {
    return getMember().getBorrowingHistory().calculateTotalLateFees();
}