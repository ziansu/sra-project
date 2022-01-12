public com.davidbalazs.chess.models.LatestNewsItemModel convertReverse(com.davidbalazs.chess.data.LatestNewsItemData latestNewsItemData) {
    com.davidbalazs.chess.models.LatestNewsItemModel latestNewsItemModel = new com.davidbalazs.chess.models.LatestNewsItemModel();
    latestNewsItemModel.setId(latestNewsItemData.getId());
    latestNewsItemModel.setTitle(latestNewsItemData.getTitle());
    latestNewsItemModel.setText(latestNewsItemData.getText());
    latestNewsItemModel.setDate(new java.util.Date());
    return latestNewsItemModel;
}