private void queryProvinces() {
    provinceList = db.loadProvinces();
    if ((provinceList.size()) > 0) {
        dataList.clear();
        for (com.example.com.myselefweather.model.Province p : provinceList) {
            dataList.add(p.getProvinceName());
        }
        adapter.notifyDataSetChanged();
        listView.setSelection(0);
        titleView.setText("中国");
        currentLever = com.example.com.myselefweather.activity.ChooseAreaActivity.LEVEL_PROVINCE;
    }else {
        queryFromServer(null, "province");
    }
}