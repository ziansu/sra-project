@java.lang.Override
public java.lang.Object getChild(int groupPosition, int childPosition) {
    java.util.List<tda367.myapplication.DetailInfo> productList = deptList.get(groupPosition).getProductList();
    return productList.get(childPosition);
}