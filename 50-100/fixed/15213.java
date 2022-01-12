@java.lang.Override
public java.lang.String getQuery() {
    int begin = line.indexOf("?");
    if (begin == (-1))
        return "";
    
    begin++;
    int end = ((line.indexOf(" ", begin)) == (-1)) ? line.length() : line.indexOf(" ", begin);
    return line.substring(begin, end);
}