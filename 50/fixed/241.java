public static token.Punctuation determineType(char c) {
    switch (c) {
        case '.' :
            return token.Punctuation.PERIOD;
        case '!' :
            return token.Punctuation.EXCLAMATION;
        case '?' :
            return token.Punctuation.QUESTION;
        case ',' :
            return token.Punctuation.COMMA;
        default :
            return null;
    }
}