private int get_button_mask() {
    int mask = 0;
    for (int button = 0; button < (_num_buttons); button++)
        mask |= (getRawButton((button + 1)) ? 1 : 0) << button;
    
    return mask;
}