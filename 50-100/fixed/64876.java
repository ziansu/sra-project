@java.lang.Override
public void onClick(android.view.View v) {
    image.setImageBitmap(null);
    thumbsContent.removeAllViews();
    com.github.oliveiradev.lib.RxPhoto.requestBitmap(v.getContext(), TypeRequest.GALLERY).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).doOnNext(new rx.functions.Action1<android.graphics.Bitmap>() {
        @java.lang.Override
        public void call(android.graphics.Bitmap bitmap) {
            image.setImageBitmap(bitmap);
        }
    }).subscribe();
}