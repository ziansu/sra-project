public geogebra.common.kernel.arithmetic.MyList getMyList() {
    int size = geoList.size();
    geogebra.common.kernel.arithmetic.MyList myList = new geogebra.common.kernel.arithmetic.MyList(kernel, size);
    for (int i = 0; i < size; i++) {
        myList.addListElement(new geogebra.common.kernel.arithmetic.ExpressionNode(kernel, ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)))));
    }
    return myList;
}