public boolean kiemtraBatThuongLonHon(int x, int binhquan3thang) {
    if (binhquan3thang != 0) {
        if ((x >= (binhquan3thang * 2)) && ((java.lang.Math.abs((x - binhquan3thang))) > 20)) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}