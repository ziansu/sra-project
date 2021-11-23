public static java.util.ArrayList<java.lang.Integer> arrayStringToIntegerArrayList(java.lang.String arrayString) {
    java.lang.String removedBrackets = arrayString.substring(1, ((arrayString.length()) - 1));
    java.lang.String[] individualNumbers = removedBrackets.split(",");
    java.util.ArrayList<java.lang.Integer> integerArrayList = new java.util.ArrayList<>();
    for (java.lang.String numberString : individualNumbers) {
        integerArrayList.add(java.lang.Integer.parseInt(numberString.trim()));
    }
    java.util.Collections.sort(integerArrayList);
    return integerArrayList;
}