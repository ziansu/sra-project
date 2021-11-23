@java.lang.Override
public void onClick(android.view.View v) {
    basic.zhenyuan0502.nguyenlt.armstore.global.GlobalFunction.setNumberOfItem(rowView.getRootView().getContext(), position);
    arrayCart.notifyAll();
}