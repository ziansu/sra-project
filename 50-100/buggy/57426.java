@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((v.getId()) == (valueView.getId())) {
        if (!hasFocus) {
            if (android.text.TextUtils.isEmpty(valueView.getText())) {
                viewSwitcher.setDisplayedChild(GenericViewHolder.FORM_NO_ANSWER_STATE);
            }else {
                viewSwitcher.setDisplayedChild(GenericViewHolder.FORM_HAS_ANSWER_STATE);
                saveValues(field);
            }
            itemView.setClickable(true);
        }else {
            itemView.setClickable(false);
        }
    }
}