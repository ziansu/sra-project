public java.lang.String sign() throws wf.bitcoin.javabitcoindrpcclient.BitcoinRpcException {
    return bitcoin.signRawTransaction(create(), null, null);
}