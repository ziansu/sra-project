private void setData(java.lang.String s, int pagecount) {
    android.util.Log.e("downData", "setData");
    dzg = com.alibaba.fastjson.JSON.parseObject(s, com.anl.wxb.dzg.DiZiGui.class);
    android.util.Log.e("setData", java.lang.String.valueOf(dzg.getList()));
    com.anl.wxb.dzg.MyAdapter myAdapter = new com.anl.wxb.dzg.MyAdapter(getApplicationContext(), dzg.getList());
    list_view.setAdapter(myAdapter);
    setListener();
    contentPage(pagecount);
}