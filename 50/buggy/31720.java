public boolean hasNext() throws java.io.IOException {
    org.apache.hadoop.hbase.client.Result result = scanner.next();
    next = client.MessageProxy.result2Message(result);
    return (next) != null;
}