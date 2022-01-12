private void init() {
    java.util.List<ir.adicom.app.greendaoapplication.Models.City> cityList = cityDao.loadAll();
    str = new java.lang.String[cityList.size()];
    for (int i = 0; i < (str.length); i++) {
        str[i] = ((cityList.get(i).getTitle()) + ",") + (cityList.get(i).getProvinceId());
    }
    adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, str);
}