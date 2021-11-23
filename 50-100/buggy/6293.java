@java.lang.Override
public int compareTo(org.chiefacc.core.PersonPairPay pp) {
    if (this.sum.equals(pp.getSum())) {
        return getBothNames().compareTo(pp.getBothNames());
    }else {
        return pp.getSum().compareTo(this.sum);
    }
}