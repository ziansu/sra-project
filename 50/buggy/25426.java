@com.yuekuapp.annotations.AsynMethod
public void actionUserFavAdd(java.lang.String goodsid) {
    sendMessage("isFavCallBack");
    actionUserFav("add", goodsid);
}