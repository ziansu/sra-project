public void setItem(fr.pasteque.client.models.interfaces.Item item) {
    if (item.hasImage()) {
        this.setBackgroundResource(R.color.product_item_inner_bg);
        this.setImageResource(android.R.color.transparent);
        switch (item.getType()) {
            case Category :
                new fr.pasteque.client.widgets.ItemImage.CategoryImageAsyncTask().execute(item.getId());
                break;
            case Product :
                new fr.pasteque.client.widgets.ItemImage.ProductImageAsyncTask().execute(item.getId());
                break;
        }
    }else {
        this.setImageResource(fr.pasteque.client.widgets.ItemImage.default_img);
    }
}