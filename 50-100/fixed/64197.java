public void visit(io.ddf.SetOperationList setOperationList) throws java.lang.Exception {
    if ((setOperationList.getSelects()) != null) {
        for (io.ddf.SelectBody selectBody : setOperationList.getSelects()) {
            selectBody.accept(this);
        }
    }
    if ((setOperationList.getOrderByElements()) != null) {
        for (io.ddf.OrderByElement orderByElement : setOperationList.getOrderByElements()) {
            orderByElement.accept(this);
        }
    }
}