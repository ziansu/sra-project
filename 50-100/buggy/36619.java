public int compare(mjson.Json left, mjson.Json right) {
    java.lang.Float f = (left.at("hasOrderBy").asFloat()) - (right.at("hasOrderBy").asFloat());
    if (f > 0)
        return 1;
    else
        if (f < 0)
            return -1;
        else
            return 0;
        
    
}