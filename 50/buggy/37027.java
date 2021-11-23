public java.lang.Object eval(byte[] script) {
    client.setTimeoutInfinite();
    client.eval(script, 0);
    return client.getOne();
}