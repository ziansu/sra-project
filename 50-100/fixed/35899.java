@javafx.fxml.FXML
public void getOneItem() {
    ebayConn();
    java.lang.String itemIDInput = itemID.getText().trim();
    getstorelist.Listings listing = ebayConnecter.getItemDetails(apiContext, itemIDInput);
    java.lang.System.out.println(listing.toString());
    setTable();
    data.add(listing);
    resultList.setItems(data);
}