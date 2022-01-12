public int getFBOWidth() {
    if (!(mCustomFBOSize))
        return mAppSettings.getEyeBufferParms().getResolution();
    else
        return mFBOWidth;
    
}