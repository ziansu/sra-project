public static void main(java.lang.String[] args) {
    data.GankDataHanlder hanlder = new data.GankDataHanlder();
    java.util.List<model.GankItem> items = null;
    try {
        items = hanlder.loadGankItems();
        java.lang.System.out.println(("gank items count=" + (items.size())));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}