private void dataGroupMinterSetup(java.lang.Boolean suffixPassThrough, java.lang.String shoulder, java.lang.Integer NAAN) {
    db = new bcid.database();
    conn = db.getConn();
    if (shoulder == null) {
        this.shoulder = "fk4";
    }else {
        this.shoulder = shoulder;
    }
    setBow(NAAN);
    prefix = (bow) + (this.shoulder);
    datasets_id = this.getDatasetId(prefix);
    this.suffixPassThrough = suffixPassThrough;
}