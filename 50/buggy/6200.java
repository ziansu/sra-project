private java.lang.String getOperator(com.ottogroup.bi.metascope.index.SolrQueryParameter.FilterType filterType) {
    switch (filterType) {
        case OR :
            return "OR";
        case AND :
        case EXCLUSIVE :
            return "AND";
        default :
            return "OR";
    }
}