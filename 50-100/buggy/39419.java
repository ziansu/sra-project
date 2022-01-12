@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public S reduce(A action, S state) {
    for (int i = 0; i < (matchers.length); i++) {
        if (match(((M) (matchers[i])), action)) {
            return ((S) (reducers[i].reduce(action, state)));
        }
    }
    return state;
}