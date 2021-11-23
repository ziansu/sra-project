public static java.lang.String getSetOfHandFromCombinations(java.util.Set<java.lang.Integer> indexesWereChoosen) {
    java.lang.StringBuilder result = new java.lang.StringBuilder("");
    for (java.lang.Integer integer : indexesWereChoosen) {
        result.append(com.levenko.myequilator.AllCards.getSetOfHandFromCombination(com.levenko.myequilator.AllCards.allCombinationsInRecyclerOrder.get(integer)));
        result.append(',');
    }
    if ((result.length()) > 0) {
        result.deleteCharAt(((result.length()) - 1));
    }
    return result.toString();
}