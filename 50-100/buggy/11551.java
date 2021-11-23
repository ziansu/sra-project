public edu.aku.hassannaqvi.mapps_form2.LHWsContract Sync(org.json.JSONObject jsonObject) throws org.json.JSONException {
    this._ID = jsonObject.getLong(edu.aku.hassannaqvi.mapps_form2.LHWsContract.singleLhw._ID);
    this.lhwId = jsonObject.getString(edu.aku.hassannaqvi.mapps_form2.LHWsContract.singleLhw.COLUMN_LHWID);
    this.lhwName = jsonObject.getString(edu.aku.hassannaqvi.mapps_form2.LHWsContract.singleLhw.COLUMN_LHWNAME);
    this.clusterName = jsonObject.getString(edu.aku.hassannaqvi.mapps_form2.LHWsContract.singleLhw.COLUMN_CLUSTERNAME);
    this.clusterCode = jsonObject.getString(edu.aku.hassannaqvi.mapps_form2.LHWsContract.singleLhw.COLUMN_CLUSTERCODE);
    return this;
}