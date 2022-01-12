@java.lang.Override
public void run() {
    if (((gettypeaHeadtext()) != null) && (!(gettypeaHeadtext().isEmpty()))) {
        listView.setVisible(true);
        listView.scrollTo(0);
        listView.setItems(gettypeaHeadtext());
    }else {
        listView.setVisible(false);
    }
}