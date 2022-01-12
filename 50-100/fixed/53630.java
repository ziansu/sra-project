private int countWhiteSpace(java.lang.CharSequence org) {
    int whiteSpace = 0;
    int length = org.length();
    for (int i = 0; i < length; ++i) {
        if ((org.charAt(i)) == ' ')
            whiteSpace++;
        
    }
    return whiteSpace;
}