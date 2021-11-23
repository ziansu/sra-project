public cn.hackingwu.search.Condition and(java.lang.String property, cn.hackingwu.search.Operator operator, java.lang.Object value) {
    cn.hackingwu.search.Condition condition = new cn.hackingwu.search.Condition(property, operator, value, null, null);
    condition.andConditionChain.add(this);
    return condition;
}