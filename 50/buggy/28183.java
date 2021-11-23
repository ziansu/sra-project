private void setUpMouse() {
    cs3500.music.controller.MouseHandler mh = new cs3500.music.controller.MouseHandler();
    mh.setClickEvent(java.awt.event.MouseEvent.BUTTON1, new cs3500.music.controller.NoteAdder());
}