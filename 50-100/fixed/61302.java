public static org.opendaylight.yangtools.yang.common.QName cachedReference(final org.opendaylight.yangtools.yang.common.QName qname) {
    final org.opendaylight.yangtools.yang.common.QNameModule myMod = qname.getModule();
    final org.opendaylight.yangtools.yang.common.QNameModule cacheMod = org.opendaylight.yangtools.yang.common.QNameModule.cachedReference(myMod);
    final org.opendaylight.yangtools.yang.common.QName what;
    if (cacheMod.equals(myMod)) {
        what = qname;
    }else {
        what = org.opendaylight.yangtools.yang.common.QName.create(cacheMod, qname.localName);
    }
    return org.opendaylight.yangtools.yang.common.QName.CACHE.getReference(what);
}