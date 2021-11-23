public static final com.jaeksoft.searchlib.webservice.query.search.SearchQueryAbstract.OperatorEnum find(java.lang.String value) {
    for (com.jaeksoft.searchlib.webservice.query.search.SearchQueryAbstract.OperatorEnum operator : com.jaeksoft.searchlib.webservice.query.search.SearchQueryAbstract.OperatorEnum.values())
        if (value.equalsIgnoreCase(operator.name()))
            return operator;
        
    
    return null;
}