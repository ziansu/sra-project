public boolean isItTouched(float x, float y) {
    if (buttonArea.contains(((int) (x)), ((int) (y)))) {
        return true;
    }else {
        return false;
    }
}