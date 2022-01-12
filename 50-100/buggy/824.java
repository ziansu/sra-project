public void setUserInputAdapter(wraith.library.WindowUtil.UserInputAdapter adapter) {
    if ((this.adapter) != null) {
        frame.removeMouseListener(adapter);
        frame.removeMouseMotionListener(adapter);
        frame.removeMouseWheelListener(adapter);
        frame.removeKeyListener(adapter);
    }
    this.adapter = adapter;
    if (adapter != null) {
        frame.addMouseListener(adapter);
        frame.addMouseMotionListener(adapter);
        frame.addMouseWheelListener(adapter);
        frame.addKeyListener(adapter);
    }
}