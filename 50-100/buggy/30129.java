public utopia.flow.generics.DataType findOptimalTargetType(utopia.flow.generics.DataType from, utopia.flow.generics.SubTypeSet to) {
    utopia.flow.generics.DataType optimalTarget = null;
    int smallestCost = -1;
    for (utopia.flow.generics.DataType type : to) {
        int cost = getConversionCost(from, type);
        if ((cost >= 0) && ((optimalTarget == null) || (cost < smallestCost)))
            optimalTarget = type;
        
    }
    return optimalTarget;
}