public static boolean isEmpty(java.lang.Object payload) {
    if (org.springframework.util.StringUtils.isEmpty(payload)) {
        return true;
    }else
        if (payload instanceof org.w3c.dom.Node) {
            return !(((org.w3c.dom.Node) (payload)).hasChildNodes());
        }else {
            throw new java.lang.RuntimeException(no.difi.meldingsutveksling.noarkexchange.PayloadUtil.PAYLOAD_UNKNOWN_TYPE);
        }
    
}