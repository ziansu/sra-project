@java.lang.Override
public void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    if ((w == 0) || (h == 0)) {
        return ;
    }
    if ((restored_image) != null) {
        load_source_image(restored_image, restored_state);
    }
}