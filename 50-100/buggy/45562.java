@java.lang.Override
public void onKeyDown(com.google.gwt.event.dom.client.KeyDownEvent event) {
    switch (event.getNativeKeyCode()) {
        case com.google.gwt.event.dom.client.KeyCodes.KEY_LEFT :
        case com.google.gwt.event.dom.client.KeyCodes.KEY_RIGHT :
        case com.google.gwt.event.dom.client.KeyCodes.KEY_UP :
        case com.google.gwt.event.dom.client.KeyCodes.KEY_DOWN :
            moveTo(event.getNativeKeyCode());
            break;
        case com.google.gwt.event.dom.client.KeyCodes.KEY_DELETE :
            album.deleteResource(album.getResourcesList().get(index), null, null);
            break;
        case com.google.gwt.event.dom.client.KeyCodes.KEY_ENTER :
            album.startSlideshow();
            break;
        case com.google.gwt.event.dom.client.KeyCodes.KEY_ESCAPE :
            album.unselectThumbnail();
            break;
    }
    event.stopPropagation();
}