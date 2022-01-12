private int countWhiteSpace(java.lang.CharSequence org) {
    int whiteSpace = 0;
    for (int i = 0; i < (org.length()); ++i) {
        if ((org.charAt(i)) == ' ')
            whiteSpace++;
        
    }
    return whiteSpace;
}