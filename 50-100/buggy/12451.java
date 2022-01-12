@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.mounacheikhna.practice.algorithms.SmartWordToy.Node node = ((com.mounacheikhna.practice.algorithms.SmartWordToy.Node) (o));
    if ((steps) != (node.steps))
        return false;
    
    return java.util.Arrays.equals(word, node.word);
}