private void searchViewChildAndSetListener(android.view.ViewGroup parent) {
    for (int i = 0; i < (parent.getChildCount()); i++) {
        android.view.View target = parent.getChildAt(i);
        if (target instanceof android.widget.LinearLayout) {
            searchViewChildAndSetListener(((android.widget.LinearLayout) (target)));
        }else
            if (target instanceof android.widget.TextView) {
                target.setOnClickListener(this);
            }
        
    }
}