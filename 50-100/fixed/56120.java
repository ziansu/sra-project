@java.lang.Override
public void addNews(javafx.scene.control.ListView<java.lang.String> listView) {
    com.newslistener.SingleData tmp = new com.newslistener.SingleData();
    if ((tmp.getTittle()) != null) {
        selectItem.add(tmp);
        (index)++;
        listView.getItems().add(((selectItem.size()) - 1), selectItem.get(((index) - 1)).getTittle());
    }
}