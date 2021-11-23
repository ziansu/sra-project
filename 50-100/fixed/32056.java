public static java.util.ArrayList<testproject.halfmoonstudios.com.ponder.Quote> getArray(int stringRes) {
    java.util.ArrayList<testproject.halfmoonstudios.com.ponder.Quote> retList = new java.util.ArrayList<>();
    for (testproject.halfmoonstudios.com.ponder.Quote q : testproject.halfmoonstudios.com.ponder.QuoteList.mQuoteArray) {
        if ((q.getmCategory().get(0)) == stringRes) {
            retList.add(q);
        }
    }
    return retList;
}