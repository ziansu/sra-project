public int compare(com.afkl.cases.df.model.StatisticModel a, com.afkl.cases.df.model.StatisticModel b) {
    if ((a.getRequestCompletionTime()) > (b.getRequestCompletionTime()))
        return -1;
    
    if ((a.getRequestCompletionTime()) == (b.getRequestCompletionTime()))
        return 0;
    
    return 1;
}