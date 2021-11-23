protected void clear() {
    if ((view_contents_) == null) {
        return ;
    }
    for (int j = 0; j != (height_); ++j) {
        for (int i = 0; i != (width_); ++i) {
            {
                view_contents_[i][j] = ' ';
                color_contents_[i][j] = java.awt.Color.black;
            }
        }
    }
}