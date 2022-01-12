@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof android.os.Bundle) {
        android.os.Bundle bundle = ((android.os.Bundle) (state));
        mOriginalHint = bundle.getCharSequence(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_ORIGINAL_HINT);
        mColorActivated = bundle.getInt(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_COLOR_ACTIVATED);
        onColorActivatedChanged();
        state = bundle.getParcelable(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_SUPER_STATE);
    }
    super.onRestoreInstanceState(state);
}