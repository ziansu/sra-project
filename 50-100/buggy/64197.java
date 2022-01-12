public void visit(io.ddf.SetOperationList setOperationList) throws java.lang.Exception {
    for (io.ddf.SelectBody selectBody : setOperationList.getSelects()) {
        selectBody.accept(this);
    }
    for (io.ddf.OrderByElement orderByElement : setOperationList.getOrderByElements()) {
        orderByElement.accept(this);
    }
}