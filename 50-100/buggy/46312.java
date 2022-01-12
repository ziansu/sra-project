public static final java.util.List<java.lang.String> AWS_UNIQUE_VM_NAMES(java.lang.String clusterName, java.lang.String groupName, int startCount, int size) {
    java.util.List<java.lang.String> names = new java.util.ArrayList<>();
    for (int i = startCount; i <= size; i++) {
        names.add((((se.kth.karamel.common.util.Settings.AWS_UNIQUE_GROUP_NAME(clusterName, groupName)) + "-") + i));
    }
    return names;
}