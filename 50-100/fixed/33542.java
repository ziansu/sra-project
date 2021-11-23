private static cc.shanruifeng.functions.udfs.model.ChinaIdArea getCardValue(io.airlift.slice.Slice card) {
    if (card == null) {
        return null;
    }
    java.lang.String cardString = card.toStringUtf8();
    int cardLength = cardString.length();
    if ((cardLength != 15) && (cardLength != 18)) {
        return null;
    }
    java.lang.String cardPrefix = cardString.substring(0, 6);
    if (cc.shanruifeng.functions.udfs.scalar.string.ChinaIdCardFunction.chinaIdAreaMap.containsKey(cardPrefix)) {
        return cc.shanruifeng.functions.udfs.scalar.string.ChinaIdCardFunction.chinaIdAreaMap.get(cardPrefix);
    }
    return null;
}