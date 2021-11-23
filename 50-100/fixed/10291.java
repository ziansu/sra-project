@com.modeliosoft.modelio.javadesigner.annotations.objid(value = "22963c8e-9140-49f2-beb7-3b2458a06c51")
private java.util.List<java.lang.Integer> bootstrapAttr(java.util.List<java.lang.Integer> attr) {
    java.util.ArrayList<java.lang.Integer> rand = new java.util.ArrayList<java.lang.Integer>(attrN);
    for (int i = 1; i < ((attrN) + 1); i++) {
        rand.add(i);
    }
    java.util.Collections.shuffle(rand);
    attr = rand.subList(0, attrSampleN);
    return attr;
}