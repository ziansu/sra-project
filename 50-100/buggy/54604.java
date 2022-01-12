public void cf_realign_encoders() {
    int cfLeft = a_left_encoder_count();
    int cfRight = a_right_encoder_count();
    if (cfLeft > cfRight) {
        set_drive_power(0.95F, 1.0F);
    }else
        if (cfRight > cfLeft) {
            set_drive_power(1.0F, 0.95F);
        }else
            if (cfRight == cfLeft) {
            }
        
    
}