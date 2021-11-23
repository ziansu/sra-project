@org.checkerframework.checker.nullness.qual.NonNull
private java.lang.String sqwrlQuery2DRL(@org.checkerframework.checker.nullness.qual.NonNull
org.swrlapi.sqwrl.SQWRLQuery query) throws org.swrlapi.exceptions.TargetSWRLRuleEngineException {
    if (!(query.hasSQWRLCollections()))
        return sqwrlNonCollectionQuery2DRL(query);
    else
        return sqwrlCollectionQuery2DRL(query);
    
}