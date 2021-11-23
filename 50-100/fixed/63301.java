public void setRoundingParams(@javax.annotation.Nullable
com.facebook.drawee.generic.RoundingParams roundingParams) {
    if (hasHierarchy()) {
        getHierarchy().setRoundingParams(roundingParams);
    }
    if ((Build.VERSION.SDK_INT) >= 21) {
        if ((roundingParams != null) && ((roundingParams.getRoundingMethod()) == (RoundingParams.RoundingMethod.OUTLINE))) {
            this.setClipToOutline(true);
            this.setOutlineProvider(com.facebook.drawee.view.GenericDraweeView.getClipOutlineProvider());
        }else {
            this.setClipToOutline(false);
            this.setOutlineProvider(null);
        }
    }
}