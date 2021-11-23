public int getCurrentFrame() {
    if ((anim_image) != null)
        return anim_image.getCurrentFrame();
    
    return curr_frame;
}