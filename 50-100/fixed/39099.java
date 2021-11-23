public static void main(java.lang.String[] args) {
    comm.Comm.setLookAndFeel();
    comm.Gui frame = new comm.Gui();
    comm.GuiListener listener = new comm.GuiListener(frame);
    frame.chb1.addItemListener(listener);
    frame.cob1.addItemListener(listener);
    frame.chb4.addItemListener(listener);
    frame.bt1.addActionListener(listener);
    frame.bt2.addActionListener(listener);
    frame.bt3.addActionListener(listener);
    frame.bt4.addActionListener(listener);
    frame.bt5.addActionListener(listener);
}