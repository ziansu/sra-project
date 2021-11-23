@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, ir.rasen.charsoo.controller.image_loader.core.assist.FailReason failReason) {
    if ((imageType == (Image_M.ImageType.BUSINESS)) && (imageSize == 1))
        imageView.setImageBitmap(android.graphics.BitmapFactory.decodeResource(context.getResources(), R.drawable.default_user_image));
    
}