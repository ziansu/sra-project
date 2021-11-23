public void deselect() {
    if ((animationType) == (ANIM_TRANSLATE_X)) {
        deselect(lastPosition, true);
    }else {
        if (((lastPosition) != (-1)) && (buttons.get(lastPosition).isChecked())) {
            setPosition(lastPosition);
        }
    }
}