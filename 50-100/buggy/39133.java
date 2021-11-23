public void setSortitemmodel() {
    java.util.Collection<org.lhedav.pp.business.model.service.Item> theList;
    theList = serviceEjb.getItemsListByServiceReference(org.lhedav.pp.backing_beans.provider.services.AddItem.service.getServicereference());
    java.lang.System.out.println(((("theList == null: " + (theList == null)) + ", service.getServicereference(): ") + (org.lhedav.pp.backing_beans.provider.services.AddItem.service.getServicereference())));
    if ((theList != null) && (!(theList.isEmpty()))) {
    }
    sortitemmodel = new org.lhedav.pp.backing_beans.provider.services.SortedDataModel(new javax.faces.model.CollectionDataModel(theList));
}