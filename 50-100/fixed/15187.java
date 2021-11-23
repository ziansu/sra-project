private boolean tokenIsNext(java.lang.String token) {
    if (stream.isNext(token)) {
        int index = stream.index();
        stream.next(token.length());
        boolean flag = false;
        if (stream.hasNext()) {
            char c = stream.next().get();
            flag = !(java.lang.Character.isJavaIdentifierPart(c));
        }else {
            flag = true;
        }
        stream.jumpTo(index);
        return flag;
    }
    return false;
}