public static <T extends Y, Y> java.util.List<com.helpme.app.utils.maybe.Maybe<Y>> cast(java.util.List<com.helpme.app.utils.maybe.Maybe<T>> maybe) {
    if (maybe == null) {
        return new java.util.ArrayList<>();
    }
    java.util.List<com.helpme.app.utils.maybe.Maybe<Y>> list = new java.util.ArrayList<com.helpme.app.utils.maybe.Maybe<Y>>() {
        {
            for (com.helpme.app.utils.maybe.Maybe<T> element : maybe) {
                add(com.helpme.app.utils.maybe.Maybe.wrap(element));
            }
        }
    };
    return list;
}