public void reduceCodeSize(int newSize) {
    java.util.List<generator.backend.Code> tmp = new java.util.ArrayList<generator.backend.Code>();
    while ((tmp.size()) != newSize) {
        tmp.add(codes.get(tmp.size()));
    } 
    this.codes = tmp;
}