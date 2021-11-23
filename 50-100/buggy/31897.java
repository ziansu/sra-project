private void addItem(java.lang.String city, com.khasang.forecast.position.Coordinate coordinate) {
    if (coordinate != null) {
        if (!(com.khasang.forecast.position.PositionManager.getInstance().positionInListPresent(city))) {
            com.khasang.forecast.position.PositionManager.getInstance().addPosition(city, coordinate);
            recyclerAdapter.addCityToNewLocationsList(city);
            cityList.add(city);
            java.util.Collections.sort(cityList);
            recyclerAdapter.notifyDataSetChanged();
        }else {
            showMessageToUser(R.string.city_exist, Snackbar.LENGTH_LONG);
        }
    }
    swapVisibilityTextOrList();
}