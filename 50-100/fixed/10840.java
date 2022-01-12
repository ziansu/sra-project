public void setAccelScale(int aScl) {
    switch (aScl) {
        case 4 :
            AccelSettings.scale = 4;
            break;
        case 8 :
            AccelSettings.scale = 8;
            break;
        case 16 :
            AccelSettings.scale = 16;
            break;
        default :
            AccelSettings.scale = 2;
            break;
    }
    calcaRes();
}