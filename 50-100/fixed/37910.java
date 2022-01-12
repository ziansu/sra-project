@java.lang.Override
public boolean contains(Y s) {
    if (((_value) != null) && (s != null)) {
        int compr = s.compareTo(_value);
        if (compr == 0)
            return true;
        else
            if ((compr < 0) && ((_left) != null))
                return _left.contains(s);
            else
                if ((compr > 0) && ((_right) != null))
                    return _right.contains(s);
                
            
        
    }
    return false;
}