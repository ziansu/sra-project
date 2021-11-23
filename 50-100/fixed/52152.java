public void splitAngle(long at) {
    if (((maxAngle) > at) && (at > 0)) {
        int position = 0;
        while ((position < (angleSectors.size())) && ((angleSectors.get(position)) < at)) {
            position++;
        } 
        angleSectors.add(position, at);
    }
}