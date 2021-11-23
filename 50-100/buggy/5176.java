public static java.lang.String field2MethodSign(java.lang.String fSign) {
    if (fSign == null)
        return null;
    else
        if ((fSign.length()) == 0)
            return "";
        else
            if ((fSign.charAt(0)) < 'a')
                return fSign;
            else {
                char[] chars = fSign.toCharArray();
                chars[0] -= mysh.codegen.CodeUtil.alphaStep;
                return new java.lang.String(chars);
            }
        
    
}