@java.lang.Override
public void onClick(android.view.View view) {
    android.graphics.Bitmap mBitmap = null;
    if ((im_logo.getDrawable()) != null) {
        if ((((android.graphics.drawable.BitmapDrawable) (im_logo.getDrawable())).getBitmap()) != null) {
            mBitmap = ((android.graphics.drawable.BitmapDrawable) (im_logo.getDrawable())).getBitmap();
        }
    }
    com.magestore.app.pos.util.StarPrintExtUtil.showSearchPrint(getContext(), mCheckoutListController.getMagestoreContext().getActivity(), mBitmap, mOrder);
}