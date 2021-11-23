@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_thumb_waterfall :
            if ((currentMode) == (com.jing.app.jjgallery.viewsystem.sub.wall.WallActivity.MODE_FOLDER)) {
                startFileWaterFallView();
                beforeDestroy();
                finish();
            }else
                if ((currentMode) == (com.jing.app.jjgallery.viewsystem.sub.wall.WallActivity.MODE_ORDER)) {
                    startOrderWaterFallView();
                    beforeDestroy();
                    finish();
                }
            
            break;
        default :
            break;
    }
    return false;
}