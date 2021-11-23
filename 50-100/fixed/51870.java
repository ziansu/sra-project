public void updateScDetail(polyu.comp.funing.model.ShoppingCartDetail d) {
    if (d == null) {
        return ;
    }
    if (((d.getSdid()) > 0) && ((polyu.comp.funing.model.ScDbProcess.dbShoppingCartDetail.query(d.getSdid()).size()) != 0)) {
        polyu.comp.funing.model.ScDbProcess.dbShoppingCartDetail.update(d);
        android.util.Log.i(polyu.comp.funing.model.ScDbProcess.TAG, "detail-update:");
    }else {
        polyu.comp.funing.model.ScDbProcess.dbShoppingCartDetail.insert(d);
        android.util.Log.i(polyu.comp.funing.model.ScDbProcess.TAG, "detail-insert:");
    }
}