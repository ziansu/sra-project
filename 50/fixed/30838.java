@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.imageView_user_picture :
            new ir.rasen.charsoo.view.dialog.PopupSelectCameraGallery(this).show();
            break;
    }
}