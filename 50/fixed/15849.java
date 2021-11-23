@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setLiveButtonAppearance((!(gui_.isLiveModeOn())));
    gui_.enableLiveMode((!(gui_.isLiveModeOn())));
}