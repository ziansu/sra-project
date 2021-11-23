@java.lang.Override
public java.util.List<java.lang.String> getAllPlanNames() {
    java.util.List<java.lang.String> result = dataBroker.selectAll(com.jnutrition.model.Plan.class).stream().map(Plan::getName).collect(java.util.stream.Collectors.toList());
    return result;
}