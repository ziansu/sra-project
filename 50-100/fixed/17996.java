@java.lang.Override
public void onSuccess(java.util.List<com.bt4vt.repository.domain.Stop> stops) {
    for (com.bt4vt.repository.domain.Stop stop : stops) {
        if (stop.toString().equals(stopString)) {
            activity.onStopsReady(java.util.Collections.singletonList(stop));
            return ;
        }
    }
    activity.onStopsReady(java.util.Collections.EMPTY_LIST);
}