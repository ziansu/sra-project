private static com.google.common.base.Predicate<lu.zhe.mtgslackbot.card.Card> getTextPredicate(final java.lang.String regexp) {
    return new com.google.common.base.Predicate<lu.zhe.mtgslackbot.card.Card>() {
        private final java.util.regex.Pattern p = java.util.regex.Pattern.compile((".*" + regexp));

        @java.lang.Override
        public boolean apply(lu.zhe.mtgslackbot.card.Card card) {
            return p.matcher(card.oracleText().toLowerCase().replaceAll("\n", "")).matches();
        }
    };
}