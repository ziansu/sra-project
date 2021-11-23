private static java.lang.String reverseTranscribe(java.lang.String s) throws java.lang.Exception {
    java.lang.StringBuffer buff = new java.lang.StringBuffer();
    for (int x = (s.length()) - 1; x > 0; x--)
        buff.append(cmcDistances.test.VerifyContif.flip(s.charAt(x)));
    
    return buff.toString();
}