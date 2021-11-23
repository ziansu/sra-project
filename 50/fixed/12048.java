@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    field = append(data.strAddress, " ", field);
    data.strAddress = "";
    super.parse(field, data);
}