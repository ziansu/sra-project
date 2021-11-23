void method(java.lang.Throwable t) {
    logger.info("My message is {}", t.getLocalizedMessage(), t);
    logger.info("My {} is {}", "message", t.getLocalizedMessage(), t);
    logger.info("My {} {} {}", new java.lang.Object[]{ "message" , "is" , t.getLocalizedMessage() , t });
}