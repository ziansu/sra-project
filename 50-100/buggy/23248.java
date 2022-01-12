public static org.logbuddy.model.Invocation invocation(java.lang.Object instance, java.lang.reflect.Method method, java.util.List<java.lang.Object> arguments) {
    org.logbuddy.LogBuddyException.check((instance != null));
    org.logbuddy.LogBuddyException.check((method != null));
    org.logbuddy.LogBuddyException.check((arguments != null));
    java.util.List<java.lang.Object> argumentsList = java.util.Collections.unmodifiableList(new java.util.ArrayList<>(arguments));
    org.logbuddy.LogBuddyException.check((!(arguments.contains(null))));
    return new org.logbuddy.model.Invocation(instance, method, argumentsList);
}