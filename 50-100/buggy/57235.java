private java.util.List<com.jydogeneral.Square> diff(java.util.List<com.jydogeneral.Square> result, com.jydogeneral.Square s, com.jydogeneral.Square kingSquare, com.jydogeneral.Direction d) {
    try {
        com.jydogeneral.Square newsquare = s.move(d);
        if (newsquare == kingSquare)
            return result;
        else {
            result.add(newsquare);
            return diff(result, newsquare, kingSquare, d);
        }
    } catch (java.lang.Exception e) {
        return result;
    }
}