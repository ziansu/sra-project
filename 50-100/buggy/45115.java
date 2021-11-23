public com.groupproject.workbench.BenchInstance[] getInstancesOfType(java.lang.String t) {
    java.util.List<com.groupproject.workbench.BenchInstance> instances = new java.util.ArrayList<com.groupproject.workbench.BenchInstance>();
    for (com.groupproject.workbench.buttons.ObjectBenchButton b : objectBenchButtons) {
        if (com.groupproject.workbench.helpers.StringHelper.stripExtension(b.className).equals(t)) {
            instances.add(b.getInstance());
        }
    }
    return instances.toArray(new com.groupproject.workbench.BenchInstance[instances.size()]);
}