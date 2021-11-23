private static int getCategoriaId(android.content.Context context, int cat) {
    java.lang.String[] categorias = context.getResources().getStringArray(R.array.categorias);
    for (int i = 0; i < (categorias.length); i++) {
        if (i == cat) {
            return cat;
        }
    }
    return -1;
}