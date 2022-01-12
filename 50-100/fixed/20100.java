public void deselectAll(com.ifalot.tripzor.ui.ListView lv) {
    if ((nSelected) == 0)
        return ;
    
    for (int i = 0; i < (checked.length); i++) {
        if (checked[i]) {
            com.ifalot.tripzor.ui.LinearLayout ll = ((com.ifalot.tripzor.ui.LinearLayout) (lv.getChildAt(i)));
            if (ll != null)
                ll.getChildAt(0).performClick();
            else {
                checked[i] = false;
                (nSelected)--;
            }
        }
    }
}