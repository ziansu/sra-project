public static com.camelatwork.common.bookstore.model.bo.BookBO toBookBO(com.camelatwork.components.model.to.BookTOType bookTOType, org.apache.camel.Exchange exchange) throws java.lang.Exception {
    com.camelatwork.components.cxfrs.web.converter.BookJAXBConverter.LOG.info("-------TYPE CONVERSION toBookBO Method------START-------");
    com.camelatwork.common.bookstore.model.bo.BookBO bookBO = new com.camelatwork.common.bookstore.model.bo.BookBO();
    if (com.camelatwork.components.cxfrs.web.converter.BookJAXBConverter.LOG.isDebugEnabled()) {
        com.camelatwork.components.cxfrs.web.converter.BookJAXBConverter.LOG.debug(("exchange" + (exchange.getIn().getBody().toString())));
    }
    return bookBO;
}