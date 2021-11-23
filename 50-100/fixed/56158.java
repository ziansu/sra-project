public static java.lang.String method2FieldSign(java.lang.String mSign) {
    if (mSign == null)
        return null;
    else
        if ((mSign.length()) == 0)
            return "";
        else
            if ((mSign.charAt(0)) > 'Z')
                return mSign;
            else {
                char[] chars = mSign.toCharArray();
                chars[0] = ((char) ((chars[0]) + (mysh.codegen.CodeUtil.alphaStep)));
                return new java.lang.String(chars);
            }
        
    
}