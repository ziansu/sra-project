private CostModel.Plan findPlanIntoMap(CostModel.PlansMap plansMap, int i) {
    java.util.Set keySet = plansMap.getPlansMap().keySet();
    java.util.Iterator iterator = keySet.iterator();
    CostModel.Plan value = new CostModel.Plan();
    for (int j = 0; j <= i; j++) {
        if (iterator.hasNext()) {
            java.lang.Object key = iterator.next();
            value = plansMap.getPlansMap().get(key);
        }
    }
    return value;
}