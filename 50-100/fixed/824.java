public void setUserInputAdapter(wraith.library.WindowUtil.UserInputAdapter adapter) {
    if ((this.adapter) != null) {
        frame.removeMouseListener(this.adapter);
        frame.removeMouseMotionListener(this.adapter);
        frame.removeMouseWheelListener(this.adapter);
        frame.removeKeyListener(this.adapter);
    }
    this.adapter = adapter;
    if (adapter != null) {
        frame.addMouseListener(adapter);
        frame.addMouseMotionListener(adapter);
        frame.addMouseWheelListener(adapter);
        frame.addKeyListener(adapter);
    }
}