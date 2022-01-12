private void submitPlayToProgram(java.lang.String methodFullName, jackplay.bootstrap.Genre genre, java.lang.String src) throws java.lang.Exception {
    jackplay.bootstrap.PlayGround pg = new jackplay.bootstrap.PlayGround(methodFullName);
    checkValidity(pg);
    if ((genre == (jackplay.bootstrap.Genre.METHOD_REDEFINE)) || (!(existsPlay(pg, genre)))) {
        addPlayToProgram(pg, genre, src);
        try {
            composer.retransformByClassName(pg.classFullName);
        } catch (java.lang.Exception e) {
            if (genre == (jackplay.bootstrap.Genre.METHOD_TRACE))
                removeMethodFromProgram(genre, pg.methodFullName);
            
            throw e;
        }
    }
}