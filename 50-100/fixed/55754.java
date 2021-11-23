@org.bedework.calfacade.annotations.ical.NoProxy
public java.lang.String getPeruserTransparency(final java.lang.String userHref) throws org.bedework.calfacade.exc.CalFacadeException {
    if ((userHref == null) || (userHref.equals(getOwnerHref()))) {
        return getTransparency();
    }
    final org.bedework.calfacade.BwXproperty pu = findPeruserXprop(userHref, BwXproperty.peruserPropTransp);
    if (pu == null) {
        return getTransparency();
    }
    return pu.getValue();
}