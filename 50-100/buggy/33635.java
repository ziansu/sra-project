public static final boolean match(nez.ast.script.TypeMatcher matcher, java.lang.reflect.Type[] p, nez.ast.script.TypedTree params) {
    if ((p.length) != (params.size())) {
        return false;
    }
    for (int j = 0; j < (p.length); j++) {
        if (!(nez.ast.script.Interface.match(matcher, p[j], params.getType()))) {
            return false;
        }
    }
    return true;
}