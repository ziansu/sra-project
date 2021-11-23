public void update(int id) {
    source = go4.szut.de.nametrainer.database.DataSource.getDataSourceInstance(activity);
    source.open();
    java.util.ArrayList<go4.szut.de.nametrainer.database.Member> t_members = source.getMembers(id);
    source.close();
    members = t_members;
    items = createHorizontalScrollViewItems();
    scrollView.update();
}