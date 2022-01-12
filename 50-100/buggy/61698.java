private void clickBuyButton() {
    android.content.res.Resources res = getResources();
    java.lang.String textBuyResult = java.lang.String.format(res.getString(R.string.buy_button_pressed), totalPrice);
    android.widget.Toast toast = android.widget.Toast.makeText(getActivity(), textBuyResult, Toast.LENGTH_SHORT);
    toast.show();
    buButtonListener.onBuyButtonClicked(adapter.getRegionItems());
    adapter.setIsBoughtRegions();
    adapter.clearSelection();
    totalPrice = 0;
    buyButton.setVisibility(View.GONE);
}