public boolean isError() {
    if (hasStatusCode()) {
        return (getStatusCode()) != 0;
    }else {
        return (message) == null;
    }
}