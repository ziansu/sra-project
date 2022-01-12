public java.lang.String replaceEntities(double[] inputs) {
    java.lang.String s = com.matrix.netai.Utils.neuToString(inputs);
    java.util.List<java.lang.String> process = new java.util.ArrayList<java.lang.String>();
    process.add(s);
    for (com.matrix.entity.Entity e : entities) {
        process.add(e.processString(process.get(((process.size()) - 1))));
    }
    return process.get(((process.size()) - 1));
}