public static java.util.ArrayList<java.lang.String> getSplitedString(java.lang.String pData, java.lang.String pDelimit) {
    java.util.ArrayList<java.lang.String> instruction = new java.util.ArrayList<>();
    java.util.StringTokenizer st = new java.util.StringTokenizer(pData, pDelimit);
    while (st.hasMoreElements()) {
        instruction.add(st.nextElement().toString());
    } 
    return instruction;
}