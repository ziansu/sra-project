public void addPoint(it.enricocandino.nel.model.Point point) {
    stream.getData().add(point);
    if ((stream.getData().size()) >= (length)) {
        it.enricocandino.nel.model.Sequence sequence = new it.enricocandino.nel.model.Sequence();
        sequence.setPoints(new java.util.ArrayList(stream.getData()));
        subsequences.add(sequence);
        stream.clear();
    }
}