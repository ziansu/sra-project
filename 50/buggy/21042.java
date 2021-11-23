public int getFBOWidth() {
    if (!(mCustomFBOSize))
        return (mAppSettings.getEyeBufferParms().getResolution()) * (mAppSettings.getEyeBufferParms().getWidthScale());
    else
        return mFBOWidth;
    
}