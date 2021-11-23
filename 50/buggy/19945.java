public void addOptionalEnderEnd(final java.lang.String otag, final java.lang.String etag) {
    simple.ml.ParserConstants.log.debug("Add Option ender end", ((etag + " ends ") + otag));
    OPTIONALENDEND.add(new simple.CIString(otag), new simple.CIString(etag));
}