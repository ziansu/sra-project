public void setExpiration(long expires) {
    this.getPayload().addStatement("message.expires", java.lang.Long.toString(expires));
}