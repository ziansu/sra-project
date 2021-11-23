@java.lang.Override
public long contentLength() {
    return (response) == null ? -1 : response.body().contentLength();
}