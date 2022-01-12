@java.lang.Override
public void addNews(javafx.scene.control.ListView<java.lang.String> listView) {
    selectItem.add(new com.newslistener.SingleData());
    (index)++;
    listView.getItems().add(((selectItem.size()) - 1), selectItem.get(((index) - 1)).getTittle());
}