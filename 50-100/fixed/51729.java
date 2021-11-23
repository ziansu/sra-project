@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof com.monits.volleyrequests.network.request.SampleData)) {
        return false;
    }
    final com.monits.volleyrequests.network.request.SampleData that = ((com.monits.volleyrequests.network.request.SampleData) (o));
    return (data) == null ? (that.data) == null : data.equals(that.data);
}