@java.lang.Override
public java.util.ArrayList<Tuple.Tuple> writeToFile() {
    Tuple.Tuple a = getNextTuple();
    java.util.ArrayList<Tuple.Tuple> result = new java.util.ArrayList<Tuple.Tuple>();
    while (a != null) {
        result.add(a);
        a = getNextTuple();
    } 
    return result;
}