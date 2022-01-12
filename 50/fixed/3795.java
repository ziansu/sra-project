public static float formatFloat(float number) {
    java.lang.String str = cn.wisdom.lottery.common.utils.NumberUtils.df.format(number);
    return cn.wisdom.lottery.common.utils.DataConvertUtils.toFloat(str);
}