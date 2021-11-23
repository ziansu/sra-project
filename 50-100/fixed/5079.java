@java.lang.Override
public com.google.common.base.Predicate<lu.zhe.mtgslackbot.card.Card> apply(java.lang.String value) {
    return new com.google.common.base.Predicate<lu.zhe.mtgslackbot.card.Card>() {
        private final java.lang.Integer comparison = lu.zhe.mtgslackbot.parsing.Parsing.parseIntSafe(value);

        @java.lang.Override
        public boolean apply(lu.zhe.mtgslackbot.card.Card card) {
            if ((comparison) == null) {
                return false;
            }
            java.lang.Integer intValue = lu.zhe.mtgslackbot.parsing.Parsing.PROPERTY_FUNCS.get(property).apply(card);
            return (intValue != null) && (intValue != (comparison));
        }
    };
}