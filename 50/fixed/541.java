public static int selectWhichDay() {
    int currentHour = java.lang.Integer.parseInt(com.dstudio.wd824.one.Data.HttpUtil.getCurrentDate("hour", 0));
    if (currentHour >= 16) {
        return 0;
    }else {
        return 1;
    }
}