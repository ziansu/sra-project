public static boolean hasHangulJongsung(char ch) {
    char[] result = org.nybatis.core.util.CharacterUtil.disassembleKorean(ch);
    if (result == null)
        return false;
    
    return (result[2]) == ' ';
}