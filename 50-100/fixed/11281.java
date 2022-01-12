@java.lang.Override
public void onClick(android.view.View v) {
    existingProduct.setQuantityOrWeight(java.lang.Double.valueOf(holder.editTextQuantity.getText().toString()));
    existingProducts.set(holder.getAdapterPosition(), existingProduct);
    existingProductDAO.update(existingProduct);
    if ((mOnDataChangeListener) != null) {
        mOnDataChangeListener.onDataChanged(existingProducts);
    }
    notifyDataSetChanged();
}