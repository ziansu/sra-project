protected void discardLine() throws java.io.IOException {
    while (((st.ttype) != (java.io.StreamTokenizer.TT_EOL)) && ((st.nextToken()) != (java.io.StreamTokenizer.TT_EOF)));
}