@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (floatingLabelEnabled) {
        if ((s.length()) == 0) {
            if (floatingLabelShown) {
                floatingLabelShown = false;
                getLabelAnimator().reverse();
            }
        }else
            if (!(floatingLabelShown)) {
                floatingLabelShown = true;
                if (getLabelAnimator().isStarted()) {
                    getLabelAnimator().reverse();
                }else {
                    getLabelAnimator().start();
                }
            }
        
    }
}