@java.lang.Override
public int compare(org.nschmidt.ldparteditor.data.Primitive o1, org.nschmidt.ldparteditor.data.Primitive o2) {
    if (o1 == me)
        return 1;
    
    if (o2 == me)
        return -1;
    
    java.lang.String name_o1 = o1.name;
    java.lang.String name_o2 = o2.name;
    return org.nschmidt.ldparteditor.data.Primitive.numberAndMinus.matcher(name_o1).replaceAll("").compareToIgnoreCase(org.nschmidt.ldparteditor.data.Primitive.numberAndMinus.matcher(name_o2).replaceAll(""));
}