public java.lang.String toString() {
    java.lang.String s = "[";
    for (RadioMenuItem radio : radios)
        s += (((radio.getLabel()) + ": ") + (radio.getState())) + ", ";
    
    return (s.substring(0, ((s.length()) - 2))) + "]";
}