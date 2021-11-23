@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if ((data.strAddress.length()) > 0)
        return ;
    
    super.parse(field, data);
}