public static java.lang.String shortName(java.lang.String longName) {
    final java.lang.String temp = longName.replace("$", ".");
    if (temp.contains(".")) {
        return temp.substring(((com.speedment.common.codegen.util.Formatting.stripGenerics(temp).lastIndexOf(".")) + 1));
    }else {
        return temp;
    }
}