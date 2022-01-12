public boolean isError() {
    if (hasStatusCode()) {
        return (getStatusCode()) != 0;
    }else
        if ((message) != null) {
            return true;
        }else {
            return (response) == null;
        }
    
}