public static int getMoney(int count, boolean economy_option, int flag) throws com.loocha.exception.ServerInternalException {
    int money = com.loocha.dao.LoochaDAOFactory.getInstance().getSettingDAO().queryPayMoney(count, economy_option, flag, 0);
    if (money < 0)
        throw new com.loocha.exception.ServerInternalException(com.loocha.exception.ServerInternalException.ERR_ILLEGAL_PARAMTER);
    
    return money;
}