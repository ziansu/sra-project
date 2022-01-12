@java.lang.Override
public int compare(org.apache.lucene.index.FieldInfo arg0, org.apache.lucene.index.FieldInfo arg1) {
    java.lang.String name0 = arg0.name;
    java.lang.String name1 = arg1.name;
    if ((name0.charAt(0)) == '_') {
        if ((name1.charAt(0)) != '_')
            return 1;
        
    }else {
        if ((name1.charAt(0)) == '_')
            return -1;
        
    }
    return name0.compareTo(name1);
}