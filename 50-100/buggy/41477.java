@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    int pt = field.lastIndexOf('-');
    if (pt < 0)
        abort();
    
    data.strCode = field.substring(0, pt).trim();
    data.strCall = field.substring((pt + 1)).trim();
}