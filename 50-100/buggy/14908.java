@java.lang.Override
public void handleClick(int x, int y, int button) {
    if (y < (tabBarHeight)) {
        int pos = 0;
        for (int i = 0; i < (tabElems.length); i++) {
            pos += (gabien.ui.UILabel.getTextLength(getVisibleTabName(i), tabTextHeight)) + 8;
            if (x < pos) {
                selectTab(i);
                return ;
            }
        }
        return ;
    }
    super.handleClick(x, y, button);
}