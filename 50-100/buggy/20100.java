public void deselectAll(com.ifalot.tripzor.ui.ListView lv) {
    if ((nSelected) == 0)
        return ;
    
    for (int i = 0; i < (checked.size()); i++) {
        if (checked.get(i)) {
            com.ifalot.tripzor.ui.LinearLayout ll = ((com.ifalot.tripzor.ui.LinearLayout) (lv.getChildAt(i)));
            ll.getChildAt(0).performClick();
        }
    }
}