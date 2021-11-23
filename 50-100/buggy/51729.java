@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof com.monits.volleyrequests.network.request.SampleData))
        return false;
    
    com.monits.volleyrequests.network.request.SampleData that = ((com.monits.volleyrequests.network.request.SampleData) (o));
    return !((data) != null ? !(data.equals(that.data)) : (that.data) != null);
}