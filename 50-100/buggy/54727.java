public static permafrost.tundra.data.IDataComparisonCriterion[] of(com.wm.data.IData[] criteria) {
    if (criteria == null)
        return null;
    
    permafrost.tundra.data.IDataComparisonCriterion[] output = new permafrost.tundra.data.IDataComparisonCriterion[criteria.length];
    for (int i = 0; i < (criteria.length); i++) {
        output[i] = new permafrost.tundra.data.IDataComparisonCriterion(criteria[0]);
    }
    return output;
}