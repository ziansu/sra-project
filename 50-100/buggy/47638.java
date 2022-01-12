@java.lang.Override
public org.zkoss.image.AImage coerceToUi(byte[] beanProp, org.zkoss.zul.Image component, org.zkoss.bind.BindContext ctx) {
    try {
        if ((beanProp != null) && ((beanProp.length) > 0)) {
            org.zkoss.image.AImage im = new org.zkoss.image.AImage("", beanProp);
            component.setContent(im);
            return im;
        }
        logger.debug("Return null => image is empty");
        return null;
    } catch (java.io.IOException e) {
        logger.error("Error occured, returning null", e);
        return null;
    }
}