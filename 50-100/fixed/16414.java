private void linkNext(model.Image[] images) {
    for (int i = 0; i < ((images.length) - 1); i++) {
        images[i].setNext(images[(i + 1)]);
    }
    images[((images.length) - 1)].setNext(images[0]);
}