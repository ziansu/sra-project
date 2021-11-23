public java.lang.String getLangElement(java.lang.String key) {
    java.lang.String str = langTool.getLangValue(key);
    if (str == null) {
        return (ChatColor.RED.toString()) + "[SFWSupport]  ����Ԫ��δ�ҵ���";
    }
    return getColorString(str.replace("'", ""));
}