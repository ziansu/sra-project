@java.lang.Override
public int calculateTotalLateFees() {
    return this.getMember().getBorrowingHistory().calculateTotalLateFees();
}