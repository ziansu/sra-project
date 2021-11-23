public void setDatas(int[] datas) {
    if (datas == null) {
        return ;
    }
    generateData(datas);
    if ((datas.length) > 0) {
        java.util.Arrays.sort(datas);
        toggleCubic(((int) ((datas[((datas.length) - 1)]) * 1.5)));
    }
}