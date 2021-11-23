@java.lang.Override
public java.lang.Object getChild(int groupPosition, int childPosition) {
    java.util.ArrayList<tda367.myapplication.DetailInfo> productList = deptList.get(groupPosition).getProductList();
    return productList.get(childPosition);
}