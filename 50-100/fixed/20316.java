public boolean isServiceEmpty() {
    setReference_();
    java.lang.System.out.println(("getReference_(): " + (getReference_())));
    java.util.Collection<org.lhedav.pp.business.model.service.Item> theItems = m_service_ejb.getItemsListByServiceReference(getReference_());
    boolean isNotEmpty = (theItems != null) && ((theItems.size()) > 0);
    if (theItems != null) {
        java.lang.System.out.println((("listSize: " + (theItems.size())) + ", "));
    }
    java.lang.System.out.println(("isNotEmpty: " + isNotEmpty));
    return !isNotEmpty;
}