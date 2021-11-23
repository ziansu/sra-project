@java.lang.Override
public void done(byte[] data, com.parse.ParseException e) {
    if ((e == null) && (data != null)) {
        restaurantModel = new com.example.vanne.tradish_alpha.Models.RestaurantModel(name, address, restId, data);
        restaurantModel.setFlag(1);
        restaurantModels.add(restaurantModel);
        updateListView();
    }else {
        restaurantModel = new com.example.vanne.tradish_alpha.Models.RestaurantModel(name, address, restId);
        restaurantModels.add(restaurantModel);
        updateListView();
    }
}