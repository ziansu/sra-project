@java.lang.Override
public org.jevis.api.JEVisFile getValueAsFile() {
    try {
        if ((getAttribute().getPrimitiveType()) != (JEVisConstants.PrimitiveType.FILE)) {
            logger.warn("Error the primitive type of this Type is not byte");
            return null;
        }
        return _file;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return null;
    }
}