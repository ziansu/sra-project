private java.util.List<cz.muni.fi.pb138.accountingxml.Invoice> parseInvoices(org.xmldb.api.base.ResourceSet resourceSet, cz.muni.fi.pb138.accountingxml.AccountingYear year) throws org.xmldb.api.base.XMLDBException {
    assert resourceSet != null;
    assert year != null;
    java.util.List<cz.muni.fi.pb138.accountingxml.Invoice> result = new java.util.ArrayList<>();
    for (org.xmldb.api.base.ResourceIterator it = resourceSet.getIterator(); it.hasMoreResources();) {
        result.add(parseInvoice(it.nextResource(), year));
    }
    return result;
}