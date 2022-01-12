public void setDatas(int[] datas) {
    if (datas == null) {
        return ;
    }
    java.util.Arrays.sort(datas);
    generateData(datas);
    if ((datas.length) > 0) {
        toggleCubic(((int) ((datas[((datas.length) - 1)]) * 1.5)));
    }
}