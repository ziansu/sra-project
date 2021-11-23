@java.lang.Override
public int compare(kelvin.pokerbankrollmanagement.CashGameSession lhs, kelvin.pokerbankrollmanagement.CashGameSession rhs) {
    java.lang.Double lhsProfit = (lhs.getCashedOut()) - (lhs.getBuyin());
    java.lang.Double rhsProfit = (rhs.getCashedOut()) - (rhs.getBuyin());
    return rhsProfit.compareTo(lhsProfit);
}