public java.lang.String getLastJobId() {
    return jobIds.isEmpty() ? null : jobIds.get(((jobIds.size()) - 1));
}