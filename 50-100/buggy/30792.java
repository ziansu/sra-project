public static void addkMapping(java.lang.String k, java.lang.String property, java.lang.String object, java.lang.String affectedEntities) {
    java.lang.String s = new java.lang.String();
    s += "\t\t\t\t\t<tr>\n";
    s += ("\t\t\t\t\t\t<td>" + k) + "</td>\n";
    s += ("\t\t\t\t\t\t<td>" + property) + "</td>\n";
    s += ("\t\t\t\t\t\t<td>" + object) + "</td>\n";
    s += ("\t\t\t\t\t\t<td>" + affectedEntities) + "</td>\n";
    s += ("\t\t\t\t\t\t<td class=\"edit\"><a href=\"?tab=mappings&k=" + k) + "\">Edit/Delete</a></td>\n";
    s += "\t\t\t\t\t</tr>\n";
    LGDEditTool.Templates.TemplatesAllMappings.al.add(s);
}