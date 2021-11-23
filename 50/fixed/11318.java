private com.rey.sqlfluent.SqlFluent add(java.lang.String word) {
    if ((mBuilder.length()) != 0)
        mBuilder.append(' ');
    
    mBuilder.append(word);
    return this;
}