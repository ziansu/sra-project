@java.lang.Override
protected void onLoad() {
    super.onLoad();
    if ((typeMixin.getType()) != null) {
        applyType(typeMixin.getType().getCssName(), getElement());
    }
}