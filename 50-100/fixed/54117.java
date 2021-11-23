public void deserialize(com.tbocek.android.combatmap.model.io.MapDataDeserializer s) throws java.io.IOException {
    int arrayLevel = s.expectArrayStart();
    while (s.hasMoreArrayItems(arrayLevel)) {
        com.tbocek.android.combatmap.model.primitives.Shape shape = com.tbocek.android.combatmap.model.primitives.Shape.deserialize(s);
        if (shape != null) {
            this.mLines.add(shape);
            if (shape.shouldDrawBelowGrid()) {
                mBelowGridLines.add(shape);
            }else {
                mAboveGridLines.add(shape);
            }
        }
    } 
    s.expectArrayEnd();
}