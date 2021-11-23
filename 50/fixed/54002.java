public java.lang.Object getValue() {
    switch (mType) {
        case IDENTIFY :
            return mIdentifyResult.getValue();
        case FIND :
            return mFindResult.getValue();
        case FEATURE :
            return mFeature.getId();
    }
    return null;
}