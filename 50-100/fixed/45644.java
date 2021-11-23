public java.lang.String getShipToInfor(java.lang.String shipToCd, java.lang.String flg, java.lang.String infor1, java.lang.String infor2, java.lang.String infor3) {
    if (isEmpty(shipToCd)) {
        return "";
    }else {
        if (flg == "0") {
            if (!(isEmpty(infor1))) {
                return infor1;
            }else {
                return infor2;
            }
        }else {
            return infor3;
        }
    }
}