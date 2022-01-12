@java.lang.Override
public void onClick(android.view.View view) {
    android.graphics.Bitmap mBitmap = ((android.graphics.drawable.BitmapDrawable) (im_logo.getDrawable())).getBitmap();
    com.magestore.app.pos.util.StarPrintExtUtil.showSearchPrint(getContext(), mCheckoutListController.getMagestoreContext().getActivity(), mBitmap, mOrder);
}