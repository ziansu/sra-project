void onOrderByClick(int order) {
    if ((orderBy) != order) {
        if ((order == (org.akvo.flow.util.ConstantUtil.ORDER_BY_DISTANCE)) && (((latitude) == null) || ((longitude) == null))) {
            view.showErrorMissingLocation();
            return ;
        }
        this.orderBy = order;
        refresh();
    }
}