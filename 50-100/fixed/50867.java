@java.lang.Override
public void run() {
    if (((gettypeaHeadtext()) != null) && (!(gettypeaHeadtext().isEmpty()))) {
        listView.setVisible(true);
        listView.setItems(gettypeaHeadtext());
        listView.scrollTo(0);
    }else {
        listView.setVisible(false);
    }
}