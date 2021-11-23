public static int includedNumbers(java.util.List<java.lang.Integer[]> ranges) {
    java.util.List<java.lang.Integer> numbers = new java.util.ArrayList<java.lang.Integer>();
    java.util.List<es.madhava.integerfun.Range> rangesList = new java.util.ArrayList<es.madhava.integerfun.Range>();
    for (java.lang.Integer[] range : ranges) {
        es.madhava.integerfun.RangeMerge.addRange(rangesList, range);
    }
    for (es.madhava.integerfun.Range range : rangesList) {
        numbers.addAll(range.getNumbers());
    }
    return numbers.size();
}