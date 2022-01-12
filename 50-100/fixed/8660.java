@java.lang.Override
public void set(java.util.Map<java.lang.String, wrapper.datastructures.DataStructure> structs, java.util.List<wrapper.Operation> ops) {
    structs.values().forEach(DataStructure::clear);
    step = new application.model.Step(new java.util.HashMap<java.lang.String, wrapper.datastructures.DataStructure>(structs));
    operations.clear();
    operations.addAll(ops);
    index = 0;
}