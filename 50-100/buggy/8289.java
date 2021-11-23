@java.lang.Override
public void addGraphCode(java.util.HashMap<java.lang.String, java.lang.String> items) {
    for (int i = 0; i < (codeGetters.size()); i++) {
        sb.append(codeGetters.get(i).getCode(items));
    }
    java.lang.System.out.println(sb.toString());
}