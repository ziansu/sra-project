@java.lang.Override
protected void updateServerSide() {
    if (fillFluid()) {
        this.isDirty = true;
    }
    if (needsUpdate(20)) {
        if (isRefilling()) {
            this.isDirty = true;
        }
    }
    super.updateServerSide();
}