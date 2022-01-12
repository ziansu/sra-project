protected void keyDown(int eventKey, char ch, boolean shift, boolean ctrl, boolean alt, boolean special) throws java.lang.Exception {
    switch (ch) {
        case '1' :
            setFullScreen(true);
            break;
        case '2' :
            setFullScreen(false);
            break;
        case 'v' :
            if (hu.qgears.opengl.commons.AbstractOpenglApplication2.LOG.isInfoEnabled()) {
                hu.qgears.opengl.commons.AbstractOpenglApplication2.LOG.info("Wireframe toggled!");
            }
            wireFrame = !(wireFrame);
            break;
        default :
            break;
    }
}