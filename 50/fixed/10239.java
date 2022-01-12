public void MakeCfgClassesNull() {
    if ((mShortStrokeSol) != null)
        mShortStrokeSol.free();
    
    if ((mLongStrokeSol) != null)
        mLongStrokeSol.free();
    
    mShortStrokeSol = null;
    mLongStrokeSol = null;
}