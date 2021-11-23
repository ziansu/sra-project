static java.util.ArrayList<java.lang.Integer> list_numbers_equal_values_col2(org.json.JSONArray ja_equal_words_v, java.lang.String v) {
    java.util.ArrayList<java.lang.Integer> list_numbers_equal_values = new java.util.ArrayList<>();
    for (int i = 0; i < (ja_equal_words_v.length()); i++) {
        if (ja_equal_words_v.get(i).toString().toLowerCase().equals(v)) {
            list_numbers_equal_values.add((i + 1));
        }
    }
    return list_numbers_equal_values;
}