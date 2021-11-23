@java.lang.Override
public void onItemReselected(int itemIndex, java.lang.String itemName) {
    if (itemIndex == 0) {
        if (!(isAutoSettingCurrentItem)) {
            if (!(isSaved)) {
                saveToInternalStorage(imageBitmap, "Wall_");
                isSaved = true;
            }
        }
        isAutoSettingCurrentItem = false;
    }else
        if (itemIndex == 1) {
            if (!(isAutoSettingCurrentItem1)) {
                setAsWallPaper();
            }
            isAutoSettingCurrentItem1 = false;
        }
    
}