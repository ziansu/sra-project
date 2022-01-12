@java.lang.Override
public void onItemClicked(int adapterPosition) {
    com.facu.market.DialogBuilder dialogBuilder = new com.facu.market.DialogBuilder();
    com.facu.market.ObjectDao.ProductBuyed productBuyed = productBuyeds.get(adapterPosition);
    if (productBuyed.isHasPromotion()) {
        dialogBuilder.builderDialogDetailProductPromo(getActivity(), productBuyed, this);
    }else {
        dialogBuilder.builderDialogDetailProductSimple(getActivity(), productBuyed, this);
    }
}