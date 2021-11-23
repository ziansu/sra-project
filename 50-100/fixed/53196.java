private void doSetClickable(android.view.View view, boolean clickable) {
    if (view == null) {
        return ;
    }
    if (!clickable) {
        if (!(view instanceof android.widget.AdapterView)) {
            view.setOnClickListener(null);
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }else
        if (!(view instanceof android.widget.AdapterView)) {
            setOnClickListener(view);
            setOnLongClickListener(view);
        }
    
}