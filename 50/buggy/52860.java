public static boolean checkStr(java.lang.String s1, java.lang.String s2) {
    if (towdium.je_characters.CheckHelper.containsChinese(s1))
        return towdium.je_characters.CheckHelper.checkChinese(s1, s2);
    else
        return s1.contains(s2);
    
}