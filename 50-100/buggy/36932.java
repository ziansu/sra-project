public boolean removeLabel(java.lang.String labelToRemove) {
    com.dpizarro.autolabel.library.Label view = ((com.dpizarro.autolabel.library.Label) (findViewWithTag(labelToRemove)));
    if (view != null) {
        removeView(view);
        decreaseLabelsCounter();
        if ((getLabelsCounter()) == (com.dpizarro.autolabel.library.AutoLabelUI.EMPTY)) {
            if ((listenerOnLabelsEmpty) != null) {
                listenerOnLabelsEmpty.onLabelsEmpty();
            }
        }
        requestLayout();
        return true;
    }
    return false;
}