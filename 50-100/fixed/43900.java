public static java.util.List<fi.helsinki.cs.tmc.langs.domain.MetaSyntax> listSyntaxes(java.lang.String fileType) {
    java.util.List<fi.helsinki.cs.tmc.langs.domain.MetaSyntax> list = new java.util.ArrayList<>();
    if (fileType.matches("java|c|cpp|h|hpp|js")) {
        list.add(new fi.helsinki.cs.tmc.langs.domain.MetaSyntax("\\/\\/", ""));
        list.add(new fi.helsinki.cs.tmc.langs.domain.MetaSyntax("\\/\\*+", "\\*+\\/"));
    }
    if (fileType.matches("xml|http|html")) {
        list.add(new fi.helsinki.cs.tmc.langs.domain.MetaSyntax("<!--", "-->"));
    }
    return list;
}