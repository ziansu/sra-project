public static java.lang.String shortName(java.lang.String longName) {
    final java.lang.String temp = com.speedment.common.codegen.util.Formatting.stripGenerics(longName.replace("$", "."));
    if (temp.contains(".")) {
        return temp.substring(((temp.lastIndexOf(".")) + 1));
    }else {
        return temp;
    }
}