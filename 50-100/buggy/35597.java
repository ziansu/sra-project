public void onChkBillClick(android.view.View view) {
    android.content.SharedPreferences spTable = getSharedPreferences("TABLE_INFO", Context.MODE_PRIVATE);
    java.lang.String tableNo = spTable.getString("txtTableNo", "");
    th.ac.buu.se.s55160077.s55160018.dezato.TableItem tableItem = new th.ac.buu.se.s55160077.s55160018.dezato.TableItem();
    tableItem.setTxtTableNo(tableNo);
    tableItem.setTxtTableStatus("F");
    new th.ac.buu.se.s55160077.s55160018.dezato.CheckBillActivity.TableUpdateFree().execute(tableItem);
    new th.ac.buu.se.s55160077.s55160018.dezato.CheckBillActivity.chkBillJson().execute("");
}