@java.lang.SuppressWarnings(value = "unchecked")
public static <T> org.terracotta.management.call.ContextualReturn<T> empty(org.terracotta.management.context.Context context) {
    return new org.terracotta.management.call.ContextualReturn<T>(org.terracotta.management.context.Context.empty(), ((T) (org.terracotta.management.call.ContextualReturn.NO_RESULT)));
}