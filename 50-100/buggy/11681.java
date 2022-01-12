@java.lang.Override
public boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    net.anei.cadpage.parsers.VA.Parser p = new net.anei.cadpage.parsers.VA.Parser(subject);
    data.strUnit = p.getLast(' ');
    java.lang.String source = p.get();
    if ((source.length()) == 0)
        return false;
    
    if (!(super.parseMsg(body, data)))
        return false;
    
    data.strBox = data.strSource;
    data.strSource = source;
    return true;
}