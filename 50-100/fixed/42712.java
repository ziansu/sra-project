@java.lang.Override
public void afterCreatingOrderItem(ar.fi.uba.trackerman.domains.OrderItem orderItemCreated) {
    java.lang.String msg = "Item/s Agregado/s al pedido!";
    if ((getView()) != null) {
        ar.fi.uba.trackerman.utils.ShowMessage.showSnackbarSimpleMessage(getView(), msg);
    }else {
        ar.fi.uba.trackerman.utils.ShowMessage.toastMessage(getContext(), msg);
    }
}