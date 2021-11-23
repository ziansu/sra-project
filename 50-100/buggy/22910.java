public static int attributeIndex(java.lang.String attribute) {
    java.lang.System.out.println("Function: attributeIndex -- *I think it's here.");
    for (int i = 0; i < (AIProjectFive.Main.attributes.size()); i++) {
        if (AIProjectFive.Main.attributes.get(i).equals(attribute)) {
            return i;
        }
    }
    return -1;
}