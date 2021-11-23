private static void calculateDiscount() {
    java.util.Collections.sort(Constants.quotes);
    double higherValue = Constants.quotes.get(0).getThreeYearTotal();
    if (higherValue > 0) {
        for (com.amazon.proposalcalculator.bean.Quote q : com.amazon.proposalcalculator.utils.Constants.quotes) {
            q.setDiscount((1 - ((q.getThreeYearTotal()) / higherValue)));
        }
    }
}