private void setValues(java.lang.String name, int mainTime, int maincost, int optTime, int optCost) {
    adapter.addItem(name, (((((((("첫 " + mainTime) + "분 까지 ") + maincost) + "원, 매 ") + optTime) + "분 마다 ") + optCost) + "원"));
    listview.setAdapter(adapter);
}