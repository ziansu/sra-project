public void mouseDragged(java.awt.event.MouseEvent e) {
    if (mCont.mouseMoved(((e.getWhen()) * 1000L), bits.glui.AwtEventTranslator.modsFor(e), e.getX(), ((mSource.getHeight()) - (e.getY())))) {
        e.consume();
    }
}