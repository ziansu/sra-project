@java.lang.Override
public long getCount(char c) {
    char lc = java.lang.Character.toLowerCase(c);
    char uc = java.lang.Character.toUpperCase(c);
    if ((((matchedChars.indexOf(lc)) != (-1)) || ((matchedChars.indexOf(uc)) != (-1))) && (lc != uc))
        return (totalAcc[lc]) + (totalAcc[c]);
    else
        return totalAcc[c];
    
}