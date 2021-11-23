@java.lang.Override
public int matches(com.davidbracewell.hermes.HString token) {
    int i = c1.matches(token);
    if (i == 0) {
        return 0;
    }
    com.davidbracewell.hermes.Annotation next = token.lastToken();
    for (int j = 0; j < i; j++) {
        next = next.next();
    }
    return i + (c2.matches(next));
}