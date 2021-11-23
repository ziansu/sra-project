@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.icon_light :
            com.uuzuche.lib_zxing.activity.CodeUtils.isLightEnable((!(isOpen)));
            break;
        case R.id.icon_picture :
            android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            startActivityForResult(intent, REQUEST_IMAGE);
            break;
    }
}