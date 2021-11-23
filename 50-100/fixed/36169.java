public java.lang.Boolean RemoveMoney(java.lang.Integer money, java.lang.String description) {
    if (money < 1)
        return false;
    
    if (money > (getBallance()))
        return false;
    
    if (description.equals(""))
        description = "Без описания";
    
    com.example.tzadmin.nfc_reader_writer.Models.MoneyLogs ml = new com.example.tzadmin.nfc_reader_writer.Models.MoneyLogs();
    ml.userid = id;
    ml.money = money;
    ml.description = description;
    ml.type = MoneyLogs.Type.REMOVE_MONEY.toString();
    return ml.insert();
}