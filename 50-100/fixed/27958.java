private void prepareForParse() {
    structureDescription = new core.parser.StructureDescription();
    int typesNum = 7;
    sizes = new java.util.HashMap<>(typesNum);
    sizes.put(1, 2);
    sizes.put(2, 4);
    sizes.put(3, 3);
    sizes.put(4, 5);
    sizes.put(5, 7);
    sizes.put(6, 6);
    sizes.put(7, 6);
}