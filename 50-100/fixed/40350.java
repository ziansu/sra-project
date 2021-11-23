public geogebra.common.kernel.arithmetic.MyList getMyList() {
    final int size = geoList.size();
    final geogebra.common.kernel.arithmetic.MyList myList = new geogebra.common.kernel.arithmetic.MyList(kernel, size);
    for (int i = 0; i < size; i++) {
        myList.addListElement(new geogebra.common.kernel.arithmetic.ExpressionNode(kernel, geoList.get(i)));
    }
    return myList;
}