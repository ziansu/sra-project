@java.lang.Override
protected void onPostExecute(java.lang.Void orderItemModel) {
    super.onPostExecute(orderItemModel);
    if ((appCompatDialog != null) && (appCompatDialog.isShowing())) {
        appCompatDialog.dismiss();
    }
    orderItemModelMap.remove(item.getCode());
    productModelList.remove(adapterPosition);
    notifyDataSetChanged();
    if ((onAdapterInteractionListener) != null) {
        onAdapterInteractionListener.onProductSelected();
    }
}