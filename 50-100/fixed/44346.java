@java.lang.Override
public void onItemClicked(com.facu.market.ObjectDao.ProductBuyed productBuyed) {
    com.facu.market.DialogBuilder dialogBuilder = new com.facu.market.DialogBuilder();
    if (productBuyed.isHasPromotion()) {
        dialogBuilder.builderDialogDetailProductPromo(getActivity(), productBuyed, this);
    }else {
        dialogBuilder.builderDialogDetailProductSimple(getActivity(), productBuyed, this);
    }
}