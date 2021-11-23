public void mouseMoved(java.awt.event.MouseEvent e) {
    if (mCont.mouseMoved(((e.getWhen()) * 1000L), bits.glui.AwtEventTranslator.modsFor(e), e.getX(), (((mSource.getHeight()) - 1) - (e.getY())))) {
        e.consume();
    }
}