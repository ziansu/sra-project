@java.lang.Override
protected void loadData() {
    boolean isFirst = ((boolean) (ganhuo.ly.com.ganhuo.util.SPUtils.get(getActivity(), "isFirst", false)));
    if (!isFirst) {
        ganhuo.ly.com.ganhuo.util.SPUtils.get(getActivity(), "isFirst", true);
    }
    getData(false, type, 0);
}