static void main() {
    boolean booleanVal;
    int var;
    int third;
    booleanVal = readlib.readBool("aBool");
    var = readlib.readPreciseInt();
    third = readlib.readInt("blabla");
    third = third + 5;
    log(third);
    var = var + third;
    log(var);
}