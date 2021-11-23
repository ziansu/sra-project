public static int intMean(final java.util.List<java.lang.Integer> intList) {
    if (intList.isEmpty())
        return 0;
    
    int sum = playground.agarwalamit.utils.ListUtils.intSum(intList);
    return sum / (intList.size());
}