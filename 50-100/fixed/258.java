public static eu.davidea.examples.models.SimpleItem newSimpleItem(int i, eu.davidea.examples.models.HeaderItem header) {
    eu.davidea.examples.models.SimpleItem item;
    if (header != null) {
        header.setSubtitle(("Attached to Simple Item " + i));
        item = new eu.davidea.examples.models.SimpleItem(("I" + i), header);
    }else {
        item = new eu.davidea.examples.models.SimpleItem(("I" + i));
    }
    item.setTitle(("Simple Item " + i));
    item.setSubtitle(("Subtitle " + i));
    return item;
}