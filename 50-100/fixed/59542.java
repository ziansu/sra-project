@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    DummyContent.ITEMS.clear();
    for (in.skonda.rms_skonda.dummy.DummyContent.DummyItem itemTemp : ItemsTemp) {
        if (((itemTemp.course.contains(query)) || (itemTemp.name.contains(query))) || (itemTemp.contact.contains(query))) {
            DummyContent.ITEMS.add(itemTemp);
        }
    }
    return false;
}