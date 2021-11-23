@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public boolean equals(java.lang.Object anotherObject) {
    if (!(anotherObject instanceof com.github.dakusui.combinatoradix.tuple.AttrValue))
        return false;
    
    com.github.dakusui.combinatoradix.tuple.AttrValue<java.lang.Object, java.lang.Object> another = ((com.github.dakusui.combinatoradix.tuple.AttrValue<java.lang.Object, java.lang.Object>) (anotherObject));
    return (equals(this.attr, another.attr)) && (equals(this.value, another.value));
}