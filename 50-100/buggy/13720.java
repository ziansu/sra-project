private void setFonts(com.example.qzero.MyAccount.Adapters.OrderItemsAdapter.ViewHolder holder) {
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.tv_item_name, FontHelper.FontType.FONTROBOLD);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.tv_item_status, FontHelper.FontType.FONT);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.tv_item_price, FontHelper.FontType.FONT);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.discountTextView, FontHelper.FontType.FONT);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.discountAmountTextView, FontHelper.FontType.FONT);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.totalAmountTextView, FontHelper.FontType.FONT);
    com.example.qzero.CommonFiles.Helpers.FontHelper.applyFont(context, holder.netAmountTextView, FontHelper.FontType.FONT);
}