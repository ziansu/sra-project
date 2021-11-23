@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.github.javaparser.javadoc.description.JavadocInlineTag that = ((com.github.javaparser.javadoc.description.JavadocInlineTag) (o));
    if ((type) != (that.type))
        return false;
    
    return content.equals(that.content);
}