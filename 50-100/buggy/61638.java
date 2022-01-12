public static pl.otros.logview.accept.query.org.apache.log4j.rule.Rule getRule(final java.lang.String p1, final java.lang.String p2) {
    if (p1.equalsIgnoreCase(LoggingEventFieldResolver.LEVEL_FIELD)) {
        return pl.otros.logview.accept.query.org.apache.log4j.rule.LevelEqualsRule.getRule(p2);
    }else
        if ((p1.equalsIgnoreCase(LoggingEventFieldResolver.TIMESTAMP_FIELD)) || (p1.equalsIgnoreCase(LoggingEventFieldResolver.DATE_FIELD))) {
            return pl.otros.logview.accept.query.org.apache.log4j.rule.TimestampEqualsRule.getRule(p2);
        }else
            if (p1.equalsIgnoreCase(LoggingEventFieldResolver.MARK_FIELD)) {
                return pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule(p2, false);
            }else {
                return new pl.otros.logview.accept.query.org.apache.log4j.rule.EqualsRule(p1, p2);
            }
        
    
}