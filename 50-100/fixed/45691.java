public boolean checkApotelesma(int apotelesma) throws guma.TriesEndException {
    if (p[praksisCounter].checkResult(apotelesma)) {
        score += tries;
        tries = 3;
        (praksisCounter)--;
        return true;
    }else {
        (tries)--;
        if ((tries) == 0) {
            tries = 3;
            throw new guma.TriesEndException((("\u0394\u03ce\u03c3\u03b1\u03c4\u03b5 \u039b\u03ac\u03b8\u03bf\u03c2 \u03b1\u03c0\u03bf\u03c4\u03ad\u03bb\u03b5\u03c3\u03bc\u03b1 3 \u03c6\u03bf\u03c1\u03ad\u03c2.\n" + (p[((praksisCounter)--)].toFullString())) + "\n\u03a4\u03bf \u03c0\u03c1\u03cc\u03b3\u03c1\u03b1\u03bc\u03bc\u03b1 \u03bc\u03b5\u03c4\u03b1\u03b2\u03b1\u03af\u03bd\u03b5\u03b9 \u03c3\u03c4\u03b7\u03bd \u03b5\u03c0\u03cc\u03bc\u03b5\u03bd\u03b7 \u03c0\u03c1\u03ac\u03be\u03b7."));
        }
        return false;
    }
}