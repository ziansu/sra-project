public void setMagScale(int mScl) {
    switch (mScl) {
        case 8 :
            MagSettings.scale = 8;
            break;
        case 12 :
            MagSettings.scale = 12;
            break;
        case 16 :
            MagSettings.scale = 16;
            break;
        default :
            MagSettings.scale = 4;
            break;
    }
    calcmRes();
}