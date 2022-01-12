@java.lang.Override
public void onItemClick(int itemIndex, java.lang.String itemName) {
    if (itemIndex == 1) {
        if (!(isAutoSettingCurrentItem1)) {
            showAlert("WallPaper Set ", "");
            setAsWallPaper();
        }
        isAutoSettingCurrentItem1 = false;
    }else
        if (itemIndex == 0) {
            if (!(isAutoSettingCurrentItem)) {
                if (!(isSaved)) {
                    saveToInternalStorage(imageBitmap, "Wall_");
                    isSaved = true;
                }
            }
            isAutoSettingCurrentItem = false;
        }
    
}