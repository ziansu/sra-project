@java.lang.Override
public int compareTo(org.chiefacc.core.PersonPairPay pp) {
    if ((this.sum.compareTo(pp.getSum())) == 0) {
        return getBothNames().compareTo(pp.getBothNames());
    }else {
        return pp.getSum().compareTo(this.sum);
    }
}