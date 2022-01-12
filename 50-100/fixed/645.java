@java.lang.Override
public boolean apply(lu.zhe.mtgslackbot.card.Card card) {
    if ((comparison) == null) {
        return false;
    }
    java.lang.Integer intValue = lu.zhe.mtgslackbot.parsing.Parsing.PROPERTY_FUNCS.get(property).apply(card);
    return (intValue != null) && (intValue <= (comparison));
}