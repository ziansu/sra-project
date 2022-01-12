public boolean getHideCompleted() {
    android.os.Bundle arguments = getArguments();
    if ((cbHideCompleted) == null) {
        return arguments.getBoolean(ActiveFilter.INTENT_HIDE_COMPLETED_FILTER, false);
    }else {
        return !(cbHideCompleted.isChecked());
    }
}