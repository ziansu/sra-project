public boolean hasNext() throws java.io.IOException {
    org.apache.hadoop.hbase.client.Result result = scanner.next();
    if (null == result)
        return false;
    
    next = client.MessageProxy.result2Message(result);
    return (next) != null;
}