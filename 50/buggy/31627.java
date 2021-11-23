public void checkBoxesVisibility(boolean state) {
    if (state)
        checkBoxVisibility = true;
    else
        checkBoxVisibility = false;
    
    notifyDataSetChanged();
}