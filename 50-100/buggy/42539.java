@permissions.dispatcher.NeedsPermission(value = Manifest.permission.READ_EXTERNAL_STORAGE)
private void gotoMatisse() {
    com.zhihu.matisse.Matisse.from(this).choose(com.zhihu.matisse.MimeType.allOf()).countable(true).maxSelectable(1).restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED).thumbnailScale(0.85F).imageEngine(new com.zhihu.matisse.engine.impl.PicassoEngine()).forResult(com.test.blur.edit.EditActivity.REQUEST_CODE_CHOOSE);
}