public java.lang.String makeComplementary(char[] editSeq) {
    java.lang.String complementarySequence = "";
    for (char c : editSeq) {
        if (c == 'A') {
            c = 'T';
        }else
            if (c == 'T') {
                c = 'A';
            }else
                if (c == 'G') {
                    c = 'C';
                }else
                    if (c == 'C') {
                        c = 'G';
                    }else {
                        complementarySequence += c;
                    }
                
            
        
    }
    return complementarySequence;
}