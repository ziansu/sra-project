public void mousePressed(processing.core.PVector mouse) {
    processing.core.PApplet.println(("mouse pressed: " + (mouse.toString())));
    if (!(mouseDown)) {
        processing.core.PVector m = new processing.core.PVector(mouse.x, mouse.y);
        for (ch.bildspur.ledforest.ui.edit.RodHandle h : handles) {
            if (h.isInside(m)) {
                currentHandle = h;
                h.grabbed = true;
                mouseDelta = processing.core.PVector.sub(h.position, m);
                mouseDown = true;
                return ;
            }
        }
    }
}