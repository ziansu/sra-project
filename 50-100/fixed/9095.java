@java.lang.Override
public void done(byte[] data, com.parse.ParseException e) {
    if (e == null) {
        if ((data != null) && ((data.length) != 0)) {
            restaurantModel = new com.example.vanne.tradish_alpha.Models.RestaurantModel(name, address, restId, data);
            restaurantModel.setFlag(1);
            restaurantModels.add(restaurantModel);
            updateListView();
        }
    }
}