@java.lang.Override
public int compare(final org.glassfish.jersey.model.internal.RankedProvider<T> o1, final org.glassfish.jersey.model.internal.RankedProvider<T> o2) {
    return ((getPriority(o1)) - (getPriority(o2))) * (order.ordering);
}