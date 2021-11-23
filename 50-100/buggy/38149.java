@java.lang.Override
public java.util.ArrayList<Tuple.Tuple> writeToFile() {
    java.util.ArrayList l = new java.util.ArrayList();
    l.add(t);
    Tuple.Tuple a = new Tuple.Tuple("", l);
    java.util.ArrayList<Tuple.Tuple> result = new java.util.ArrayList<Tuple.Tuple>();
    while ((a = getNextTuple()) != null) {
        result.add(a);
    } 
    return result;
}