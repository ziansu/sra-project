@java.lang.Override
public java.lang.String getQuery() {
    int begin = line.indexOf("?");
    if (begin == (-1))
        return "";
    
    int end = ((line.indexOf(" ", begin)) == (-1)) ? begin : line.indexOf(" ", begin);
    return line.substring((begin + 1), end);
}