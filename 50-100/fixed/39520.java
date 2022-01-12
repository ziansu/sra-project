@java.lang.Override
public android.view.View getCellView(int rowIndex, int columnIndex, android.view.ViewGroup parentView) {
    com.yelprestaurantapp.bean.Restaurant restaurant = getRowData(rowIndex);
    android.view.View renderedView = null;
    switch (columnIndex) {
        case 0 :
            renderedView = renderName(restaurant);
            break;
        case 1 :
            renderedView = renderAddress(restaurant);
            break;
        default :
            break;
    }
    return renderedView;
}