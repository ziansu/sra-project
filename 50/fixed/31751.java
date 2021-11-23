public static java.util.ArrayList<java.lang.String> getCode(int length) {
    java.util.ArrayList<java.lang.String> colourList = Code.makeList();
    java.util.ArrayList<java.lang.String> codedList = Code.makeCode(colourList, length);
    return codedList;
}