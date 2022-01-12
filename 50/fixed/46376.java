protected synchronized java.lang.Long[] getLastPlayed(github.daneren2005.dsub.util.Pair<java.lang.Integer, java.lang.String> pair) {
    if (pair == null) {
        return null;
    }else {
        return getLastPlayed(pair.getFirst(), pair.getSecond());
    }
}