public java.lang.String toString() {
    java.lang.String output = "[";
    for (RadioMenuItem radio : radios)
        output += (((radio.getLabel()) + ": ") + (radio.getState())) + ", ";
    
    return (output.substring(0, ((output.length()) - 2))) + "]";
}