public org.cubeengine.pericopist.Pericopist getPericopist(java.lang.String resource, int readTimeout, org.apache.velocity.context.Context velocityContext, java.util.logging.Logger logger) throws org.cubeengine.pericopist.exception.PericopistException {
    return this.getPericopist(resource, java.nio.charset.Charset.forName("UTF-8"), readTimeout, null, logger);
}