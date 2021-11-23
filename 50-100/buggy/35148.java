public void addString(java.lang.String str) {
    com.moddamage.parsing.IDataProvider<java.lang.String> msgDP = com.moddamage.parsing.DataProvider.parse(info, java.lang.String.class, str);
    if (msgDP != null) {
        messages.add(msgDP);
        com.moddamage.LogUtil.info(msgDP.toString().replaceAll("%", "%%"));
    }
}