public java.lang.String getLangElement(java.lang.String key) {
    if ((langTool) == null) {
        return null;
    }
    java.lang.String str = langTool.getLangValue(key);
    if (str == null) {
        return (ChatColor.RED.toString()) + "[SFWSupport]  ����Ԫ��δ�ҵ���";
    }
    return getColorString(str.replace("'", ""));
}