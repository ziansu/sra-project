@java.lang.Override
public java.lang.String toString() {
    java.lang.String stringMeasures = "";
    java.util.Iterator it = measures.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        stringMeasures += ((java.lang.String) (pair.getValue())) + "\n";
    } 
    return "Measures: \n" + stringMeasures;
}