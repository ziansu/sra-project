public void getBlendCatgFromBlendID() {
    classes.ResultArray resultArray;
    java.lang.String query = ("SELECT blendCategory FROM blend WHERE blendID = '" + (this.getBlendID())) + "'";
    resultArray = dbConn.getResultArray(query);
    if (resultArray.next()) {
        this.setBlendCategory(resultArray.getString(0));
    }
}