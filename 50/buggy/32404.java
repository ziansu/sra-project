public static net.gtaun.shoebill.object.DialogId create(net.gtaun.shoebill.object.DialogId.OnResponseHandler onResponse, net.gtaun.shoebill.object.DialogId.OnShowHandler onShow, net.gtaun.shoebill.object.DialogId.OnCloseHandler onClose) throws net.gtaun.shoebill.exception.CreationFailedException {
    return net.gtaun.shoebill.SampObjectManager.get().createDialogId();
}