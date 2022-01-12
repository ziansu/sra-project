public void replace(java.util.List<model.entity.Entity> entities) {
    model.entity.Computer replacement = new model.entity.Computer(getEnvironment(), getLocation(), server, getReportSelf());
    die();
    replacement.setAge(0);
    report(java.lang.String.format("Computer %d is now my replacement.", ((model.Counter.computer) - 1)));
    entities.add(replacement);
}