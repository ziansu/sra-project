@java.lang.Override
protected java.util.List<java.lang.String> calculateTickValues(double length, java.lang.Object range) {
    java.lang.String[] markers = new java.lang.String[]{ "lolo" , "lo" , "hi" , "hihi" };
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String mark : markers)
        if (isValueOnAxis(mark))
            list.add(mark);
        
    
    return list;
}