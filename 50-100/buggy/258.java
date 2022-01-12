public static eu.davidea.examples.models.SimpleItem newSimpleItem(int i, boolean withHeader) {
    eu.davidea.examples.models.SimpleItem item;
    if (withHeader) {
        eu.davidea.examples.models.HeaderItem header = eu.davidea.examples.flexibleadapter.DatabaseService.newHeader(i);
        header.setSubtitle(("Attached to Simple Item " + i));
        item = new eu.davidea.examples.models.SimpleItem(("I" + i), header);
    }else {
        item = new eu.davidea.examples.models.SimpleItem(("I" + i));
    }
    item.setTitle(("Simple Item " + i));
    item.setSubtitle(("Subtitle " + i));
    return item;
}