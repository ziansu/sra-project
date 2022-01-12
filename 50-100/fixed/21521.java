@java.lang.Override
public void onClick(android.view.View v) {
    existingProduct.setQuantityOrWeight(java.lang.Double.valueOf(holder.editTextQuantity.getText().toString()));
    existingProductDAO.update(existingProduct);
    existingProducts.set(holder.getAdapterPosition(), existingProduct);
    if ((mOnDataChangeListener) != null) {
        mOnDataChangeListener.onDataChanged(existingProducts);
    }
    notifyDataSetChanged();
}