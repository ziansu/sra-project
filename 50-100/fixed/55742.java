public void deselect() {
    if (!(buttons.get(lastPosition).isChecked()))
        return ;
    
    if ((animationType) == (ANIM_TRANSLATE_X)) {
        deselect(lastPosition, true);
    }else {
        if ((lastPosition) != (-1)) {
            setPosition(lastPosition);
        }
    }
}