@java.lang.Override
protected void onPostExecute(java.util.List<nz.co.ipredict.phydano.appipredict.Traders> info) {
    mDialog.dismiss();
    for (int i = 0; i < 10; i++) {
        roiGrowingList.add(roiValues.get(i));
        netGrowingList.add(networthValues.get(i));
    }
    loadView(roiGrowingList, false);
    toogleSwitch = false;
    clicked();
}