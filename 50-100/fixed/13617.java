@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    com.iluwatar.hexagonal.domain.LotteryTicketCheckResult other = ((com.iluwatar.hexagonal.domain.LotteryTicketCheckResult) (obj));
    return ((checkResult) == (other.checkResult)) && ((prizeAmount) == (other.prizeAmount));
}