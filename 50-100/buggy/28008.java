@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    int pt = field.indexOf(' ');
    if (pt < 0)
        abort();
    
    data.strCode = field.substring(0, pt);
    data.strCall = field.substring((pt + 1)).trim();
}