public java.lang.String display(java.lang.String name) {
    java.util.List<com.giisoo.framework.common.Stat> list = names.get(name);
    if ((list != null) && ((list.size()) > 0)) {
        return list.get(0).getDisplay();
    }
    return com.giisoo.core.bean.X.EMPTY;
}