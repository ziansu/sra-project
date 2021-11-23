@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        com.wireless.common.ShoppingCart.instance().addFood(of);
        refreshDisplay(of.asFood(), layout, position);
    } catch (com.wireless.exception.BusinessException e) {
        android.widget.Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}