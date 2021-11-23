@com.yuekuapp.annotations.AsynMethod
public void actionUserFavAdd(java.lang.String goodsid) {
    actionUserFav("add", goodsid);
    sendMessage("isFavCallBack");
}