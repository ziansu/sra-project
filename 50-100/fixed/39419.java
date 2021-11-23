@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public S reduce(A action, S state) {
    for (int i = 0; i < (matchers.size()); i++) {
        if (match(matchers.get(i), action)) {
            return ((S) (reducers.get(i).reduce(action, state)));
        }
    }
    return state;
}