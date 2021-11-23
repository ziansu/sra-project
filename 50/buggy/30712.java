public void setExpiration(long expires) {
    this.getPayload().addStatement("message.expires", new java.lang.Long(expires).toString());
}