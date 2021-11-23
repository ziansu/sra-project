public void draw(algvis.fingertree.View v) {
    if ((f) == null) {
        v.drawImage(algvis.fingertree.Finger.img, 50, 50, 20, 20);
    }else {
        v.drawImage(algvis.fingertree.Finger.img, ((f.x) + 5), ((f.y) + 5), 20, 20);
    }
}