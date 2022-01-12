@java.lang.Override
public java.lang.String toString() {
    java.lang.String str = "";
    java.util.Iterator it = iterator();
    while (it.hasNext()) {
        if (str.equals("")) {
            str = str + (it.next());
        }else {
            str = (str + ", ") + (it.next());
        }
    } 
    return ("[ " + str) + " ]";
}