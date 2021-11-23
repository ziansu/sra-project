@java.lang.Override
public long length() {
    return response.getResults().getNumFound();
}