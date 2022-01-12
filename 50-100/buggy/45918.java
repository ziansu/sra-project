private int selectSpinnerItem(android.widget.SpinnerAdapter adapter) {
    if ((card) != null)
        for (int i = 0; i < (adapter.getCount()); i++)
            if (adapter.getItem(i).equals(card.getFlag())) {
                positionAccount = i;
                return i;
            }
        
    
    return 0;
}