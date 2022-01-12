@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public V get(int n) {
    if ((n > (-1)) && (n < (values.length))) {
        edu.cpp.cs.cs240.prog_assgmnt_3.SimpleBoundedList<K, V>.Entry e = ((edu.cpp.cs.cs240.prog_assgmnt_3.SimpleBoundedList<K, V>.Entry) (values[((n + (start)) % (values.length))]));
        if (e == null)
            return null;
        else
            return e.value;
        
    }else
        return null;
    
}