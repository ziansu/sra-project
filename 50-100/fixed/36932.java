public boolean removeLabel(java.lang.String labelToRemove) {
    com.dpizarro.autolabel.library.Label label = ((com.dpizarro.autolabel.library.Label) (findViewWithTag(labelToRemove)));
    if (label != null) {
        removeView(label);
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