public void loadDNAMethylHeader() throws java.io.IOException {
    java.io.BufferedReader brheaderfile = ernst.ChromImpute.Util.getBufferedReader(szmethylheader);
    java.lang.String szLine = brheaderfile.readLine();
    java.util.StringTokenizer st = new java.util.StringTokenizer(szLine, "\t ");
    numdnamethylcells = (st.countTokens()) - 1;
    dnamethylheader = new java.lang.String[numdnamethylcells];
    st.nextToken();
    for (int nkindex = 0; nkindex < (numdnamethylcells); nkindex++) {
        dnamethylheader[nkindex] = st.nextToken();
    }
    brheaderfile.close();
}